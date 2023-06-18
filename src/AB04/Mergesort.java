package AB04;

public class Mergesort {
    private int[] a;

    public Mergesort(int[] anArray){
        a = anArray;
    }
    public void sort(){
        
    }
    public static void mergesort(int[] a) {
        if (a.length == 1) return;
        else {
            int[] first = new int[a.length / 2];
            int[] second = new int[a.length - first.length];
            System.arraycopy(a, 0, first, 0, first.length);
            System.arraycopy(a, first.length, second, 0, second.length);

            mergesort(first);
            mergesort(second);
            mergeit(first, second, a);

        }
    }

    private static void mergeit(int[] first, int[] second, int[] a) {
        int iFirst = 0; // Next element to consider in the first array
        int iSecond = 0; // Next element to consider in the second array
        int j = 0 ; //Next open position in a
        while ((iFirst < first.length) && (iSecond < second.length)) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }
        while (iSecond < second.length) {// Copy any remaining entries of the second half a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}

package AB02;

public class WarmUp {
    /**
     * Naive version: checks if the product of any two array elements is odd.
     * @param array
     * @return
     */
    public boolean checkOdd(int[] array) {

        boolean isOdd = false;
        for (int element : array) {
            for (int i = 0; i < array.length; i++) {
                if ((element * array[i]) % 2 == 1) {
                    isOdd = true;
                    break;
                } else {
                    isOdd = false;
                }
            }
        }
        return isOdd;
    }

    public boolean checkOddSimpler(int[] array) {
        int count = 0;
        for (int element : array) {
            if(element%2==1){
                count++;

                if(count>=2){
                    return true;
                }
            }
        }
        return false;
    }
}

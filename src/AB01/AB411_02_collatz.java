package AB01;

public class AB411_02_collatz {
    long resultProceduralAlgorithm;
    long resultFunctionalAlgorithm;
    long a;


    private void collatzProceduralAlgorithm(long n) {
        // Enthält Iterationen (while oder for)
        long number = n;
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
            System.out.println(number);
        }
        resultProceduralAlgorithm = number;
    }

    private void collatzFunctionalAlgorithm(long n) {
        // Keine Iterationen oder lokale Variabeln
        if (n > 0) {
            if (n % 2 == 0) {
                resultProceduralAlgorithm = n / 2;
                n = n / 2;
            } else {
                resultProceduralAlgorithm = 3 * n + 1;
                n = 3 * n + 1;
            }
            System.out.println(n);
        }
        if (n != 1) {
            collatzProceduralAlgorithm(n);
        }
    }

    public long getResultProceduralAlgorithm() {
        return resultProceduralAlgorithm;
    }

    public void calculateProceduralAlgorithm(long n) {
        collatzProceduralAlgorithm(n);
    }

    public long getResultFunctionalAlgorithm() {
        return resultFunctionalAlgorithm;
    }

    public void calculateFunctionalAlgorithm(long resultFunctionalAlgorithm) {
        collatzFunctionalAlgorithm(resultFunctionalAlgorithm);
    }

    /*
        int inputNumber;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter an integer that is greater than 1: ");
        String input = scanner.nextLine();
        inputNumber = Integer.parseInt(input);
        AB411_02_collatz a = new AB411_02_collatz();
        //a.calculateProceduralAlgorithm(inputNumber);
        a.calculateFunctionalAlgorithm(inputNumber);
    */
}

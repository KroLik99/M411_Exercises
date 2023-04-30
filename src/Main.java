import static AB01.Game_Of_Life.*;


public class Main {
    public static void main(String[] args) {

        //XOR
        /*
        System.out.println("Arguments:");
        for (String argument : args) {
            System.out.println(argument);
        }
        System.out.println("---------");


        int inputNumber;
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please enter an integer that is greater than 1: ");
        String input = scanner.nextLine();
        inputNumber = Integer.parseInt(input);
        AB411_02_collatz a = new AB411_02_collatz();
        //a.calculateProceduralAlgorithm(inputNumber);
        a.calculateFunctionalAlgorithm(inputNumber);
    */
        boolean[][] welt = initWelt();
        System.out.println("Startkonstellation");
        zeigeWelt(welt);
        for (int i = 1; i <= 100; i++) {
            welt = wendeRegelnAn(welt);
            System.out.println("Generation " + i);
            zeigeWelt(welt);
        }
    }
}
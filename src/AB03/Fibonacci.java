package AB03;

public class Fibonacci {
    long first, second;
    long a = 1;
    public void fibonacci_procedure(long first, long second){
        if(a >= 50){
            return;
        }
        long result = first + second;
        first = second;
        second = result;
        System.out.println(first + " + " + second);
        System.out.println(result);
        a++;
        fibonacci_procedure(first, second);
        }
    public static long fibonacciRekursiv(long n) {
        if (n == 1 || n == 2) { return 1; }
        return fibonacciRekursiv(n - 1) + fibonacciRekursiv(n - 2); }

}

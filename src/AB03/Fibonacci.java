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
}

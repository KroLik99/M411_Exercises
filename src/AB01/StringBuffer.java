package AB01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringBuffer {
    public static  void test() throws IOException {
        String a, b, c;
        BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte geben Sie den ersten String ein: ");
        a = din.readLine();
        System.out.println("Bitte geben Sie den zweiten String ein:");
        b = din.readLine();
        System.out.println("Bitte geben Sie den zweiten String ein:");
        c = din.readLine();
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }

}

package AB01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringBuffer {
        String a, b, c;
        BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Bitte geben Sie den ersten String ein: ");
    a = String.parse(din.readLine());
        System.out.println("Bitte geben Sie den zweiten String ein:");
    b = String.parse(din.readLine());
        System.out.println("Bitte geben Sie den zweiten String ein:");
    c = din.readLine();
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
}

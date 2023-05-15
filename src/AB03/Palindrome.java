package AB03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    String palindromeInput;
    int i = 0;
    public String getInput() throws IOException {
        BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte geben Sie das Palindrome ein: ");
        return palindromeInput = din.readLine();
    }
    public boolean isPalindrome(String palindromeInput){
        boolean isPalindrome = true;
        for(int i = 0; i<palindromeInput.length(); i++){
            System.out.println(palindromeInput.charAt(i));
            System.out.println(palindromeInput.charAt(palindromeInput.length()-1-i));
            if(palindromeInput.charAt(i) != palindromeInput.charAt(palindromeInput.length()-1-i)){
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
    public boolean isPalindromeRecursion(String palindromeInput) {
        if (palindromeInput.length() <= 1) {
            return true;
        }

        if (palindromeInput.charAt(0) != palindromeInput.charAt(palindromeInput.length() - 1 )) {
            return false;
        } else {
            return isPalindromeRecursion(palindromeInput.substring(1,palindromeInput.length()-1));
        }
    }
}
/*
public static void main(String[] args) throws IOException {
        Palindrome p = new Palindrome();
        String input = p.getInput();
        //System.out.println(p.isPalindrome(input));
        System.out.println(p.isPalindromeRecursion(input));
    }
 */

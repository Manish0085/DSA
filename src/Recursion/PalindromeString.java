package Recursion;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PalindromeString {


    static boolean isPalindrome(String s, int i){
        if(i >= s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)){
            return false;
        }
        return isPalindrome(s, i+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String str = sc.nextLine();
        System.out.println(isPalindrome(str, 0));
    }
}

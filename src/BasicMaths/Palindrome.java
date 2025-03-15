package BasicMaths;

import java.util.Scanner;

public class Palindrome {

    public static boolean check(int n){
        if(n < 0){
            return false;
        }
        int num = n;
        int rev = 0;
        while(num > 0){
            rev = rev*10 + (num % 10);
            num /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println("The no. "+n+" is palindrome :: "+check(n));
    }
}

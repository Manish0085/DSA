package BasicMaths;

import java.util.Scanner;

public class Reverse {

    public static int reverse(int n){
        boolean bool = false;
        if(n < 0){
            bool = true;
            n = Math.abs(n);
        }
        int rev = 0;
        while (n > 0){
            rev = rev*10 + (n%10);
            n /= 10;
        }
        return bool? -rev: rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println("The reverse of "+n+" is "+reverse(n));
    }

}

package BasicMaths;

import java.util.Scanner;

public class CountDigits {

    public static int count(int n){

        if(n < 0){
            n = Math.abs(n);
        }
        int count = 0;

        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println("The no. of digits in "+n+" is "+count(n));
    }
}

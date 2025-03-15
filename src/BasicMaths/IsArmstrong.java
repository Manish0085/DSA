package BasicMaths;

import java.util.Scanner;

public class IsArmstrong {

    public static boolean isArmstrong(int n){
        if(n < 0){
            return false;
        }

        int num = n, num1 = n;
        int count = 0;

        while(n > 0){
            count++;
            n /= 10;
        }
        double sum = 0;
        while (num > 0){
            int rem = num%10;
            sum += Math.pow(rem, count);
            num /= 10;
        }
        return num1 == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println("The no. "+n+" is armstrong :: " +isArmstrong(n));
    }
}

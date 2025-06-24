import java.util.Scanner;

public class PositiveOrNegative {

    Scanner sc = new Scanner(System.in);

    public void check(){
        System.out.print("Enter the number");
        int num = sc.nextInt();
        if (num > 0){
            System.out.println(num+" is positive");
        }
        else {
            System.out.println(num+" is negative");
        }
    }

    public void findGreatest(){
        System.out.print("Enter Two Numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println(a+" and "+b+" both are equal");
        }
        else {
            if (a > b){
                System.out.println(a+" is greater than "+b);
            }
            else {
                System.out.println(b+" is greater than "+a);
            }
        }
    }

    public void factorial(){
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }

    public void isPrime(){
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        if(num < 2){
            System.out.println(num+" is not prime");
            return;
        }
        for (int div = 2; div < num; div++) {
            if (num % div == 0){
                System.out.println(num+" is not prime");
                return;
            }
        }
        System.out.println(num+" is a prime");
        return;
    }
}

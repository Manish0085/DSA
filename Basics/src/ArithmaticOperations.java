import java.util.Scanner;

public class ArithmaticOperations {

    Scanner sc = new Scanner(System.in);

    public void sum() {
        int a, b;
        System.out.print("Enter two number ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    public void substraction() {
        int a, b;
        System.out.print("Enter two number ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Substraction of "+a+" and "+b+" is "+(a-b));
    }

    public void product() {
        int a, b;
        System.out.print("Enter two number ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Product of "+a+" and "+b+" is "+(a*b));
    }

    public void division() {
        int a, b;
        System.out.print("Enter two number ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Division of "+a+" and "+b+" is "+(a/b));
    }
}

import java.util.Scanner;

public class SquareAndCube {


    Scanner sc = new Scanner(System.in);


    public void sqrt() {
        System.out.print("Enter two number ");

        int num = sc.nextInt();
        System.out.println("Square of "+num+" is "+(num*num));
    }


    public void cube() {
        System.out.print("Enter two number ");
        int num = sc.nextInt();
        System.out.println("Cube of "+num+" is "+(num*num*num));
    }
}

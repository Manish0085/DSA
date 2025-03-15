package Recursion;

import java.util.Scanner;

public class PrintNumberFromNTo1 {

    public static void print(int n){
        if(n == 0)
            return;
        System.out.print(n+" ");
        n--;
        print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = sc.nextInt();
        print(n);
    }
}

package Recursion;

import java.util.Scanner;

public class PrintNameNTimes {

    public static void print(int n){
        if(n == 0){
            return;
        }
        System.out.println("I code in java language");
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

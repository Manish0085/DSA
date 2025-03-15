package Recursion;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static int find(int n){
        if(n <= 1){
            return n;
        }
        return find(n-1) + find(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        System.out.println(find(n));
    }
}

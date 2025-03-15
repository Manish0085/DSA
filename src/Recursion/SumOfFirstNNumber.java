package Recursion;

import java.util.Scanner;

public class SumOfFirstNNumber {

    public static int sum(int n){
        if(n == 0)
            return 0;
        return n + sum(n-1);
    }

    public static void sumUsingParameterized(int i, int sum){
        if( i < 1){
            System.out.println(sum);
            return;
        }
        sumUsingParameterized(i-1, sum+i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. ");
        int n = sc.nextInt();
//        System.out.println(sum(n));
        sumUsingParameterized(n, 0);
    }
}

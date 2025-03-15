package Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountFrequencyOfElementInArray {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[13];
        Arrays.fill(hash, 0);
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        System.out.println("Enter the no. that how many no. you are to check");
        int q = sc.nextInt();
        while (q-- != 0){
            int number = sc.nextInt();
            System.out.print(number+" --> "+hash[number]);
        }
    }
}

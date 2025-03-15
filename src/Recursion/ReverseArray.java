package Recursion;

import java.util.Scanner;

public class ReverseArray {

    public static void swapUsingTwoPointer(int[] arr, int l, int r){
        if(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            swapUsingTwoPointer(arr, l+1, r-1);
        }

    }

    public static void swapUsingOnePointer(int[] arr, int i){
        if (i < arr.length/2){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
            swapUsingOnePointer(arr, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        swapUsingOnePointer(arr, 0);
        for (int a: arr){
            System.out.print(a+" ");
        }

    }
}

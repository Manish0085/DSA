package Sorting;

import java.util.Scanner;

public class InsertionSort {

    public static void sort(int[] arr, int n){
        int j;
        for (int i = 0; i < n; i++) {
            j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
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
        sort(arr, n);
        for (int a: arr){
            System.out.print(a+" ");
        }
    }
}

package Sorting;

import java.util.Scanner;

public class QuickSort {

    public static void sort(int[] arr, int low, int high){
        if(low < high){
            int p = findPivot(arr, low, high);
            sort(arr, low, p-1);
            sort(arr, p+1, high);
        }
    }

    public static int findPivot(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j){

            while (arr[i] <= pivot && i < high){
                i++;
            }
            while (arr[j] > pivot && j > low){
                j--;
            }

            if (i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
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
        sort(arr, 0, n-1);
        for (int a: arr){
            System.out.print(a+" ");
        }
    }
}

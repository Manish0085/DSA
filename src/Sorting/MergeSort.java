package Sorting;

import java.util.Scanner;

public class MergeSort {

    public static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high-low+1];
        int k = 0;
        int left = low;
        int right = mid+1;
        while (left <= mid && right <= high){
            if(arr[left] <= arr[right])
                temp[k++] = arr[left++];
            else
                temp[k++] = arr[right++];
        }
        while (left <= mid)
            temp[k++] = arr[left++];
        while (right <= high)
            temp[k++] = arr[right++];



        for (int i = low; i <= high; i++) {
            arr[i] = temp[i-low];
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
        sort(arr, 0, n-1);
        for (int a: arr){
            System.out.print(a+" ");
        }
    }
}

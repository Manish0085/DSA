package Sorting;

public class BubbleSort {


    // Time complexity : Best Case :- O(n)
    //                   Worst Case :- O(n^2)
    public static void bubbleSort1(int[] arr){
        for (int i = arr.length-1; i > 0; i--) {
            boolean swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if (!swap)
                break;
        }
        for(int x: arr)
            System.out.println(x);
    }


    public static void bubbleSort2(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int x: arr){
            System.out.println(x);
        }
    }


    public static void bubbleSort3(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = arr.length-1; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        for (int x : arr)
            System.out.println(x);
    }

    public static void main(String[] args) {
        bubbleSort1(new int[]{85, 12, 3, 5, 90, 42, 56, 3});
    }
}

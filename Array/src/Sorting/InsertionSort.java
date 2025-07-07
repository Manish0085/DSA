package Sorting;

public class InsertionSort {


    // Time Complexity: Best Case :- O(n)
    //                  Worst Case :- O(n^2)
    public static void sort1(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > num) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = num;
        }
        for (int x: arr)
            System.out.println(x);
    }


    public static void sort2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
        for (int num: arr){
            System.out.println(num);
        }
    }

    public static void sort3(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else {
                    break;
                }
            }
        }
        for (int num: arr){
            System.out.println(num);
        }
    }

    public static void sort4(int[] arr){
        for (int i = arr.length-2; i >= 0; i--) {
            for (int j = i; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else {
                    break;
                }
            }
        }
        for (int num: arr){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        sort4(new int[]{5, 2, 8, 9, 3, 1, 2});

    }
}

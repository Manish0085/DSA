package Recursion;

public class ReverseAnArray {


    public static void reverseUsingTwoPointer(int[] arr){
        reverse(arr, 0, arr.length-1);
    }

    private static void reverse(int[] arr, int left, int right){
        if (left >= right){
            return;
        }
        swap(arr, left, right);
        reverse(arr, left+1, right+1);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseUsingSinglePointer(int[] arr){
        reverse(arr, 0);
    }

    public static void reverse(int[] arr, int i){
        if (i >= arr.length/2){
            return;
        }
        swap(arr, i, arr.length-i-1);
        reverse(arr, i+1);
    }
}

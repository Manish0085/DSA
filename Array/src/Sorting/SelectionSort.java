package Sorting;

public class SelectionSort {


    // Time Complexity O(n^2)
    // Space Complexity O(1)
    public static void firstWay(int[] arr){


        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[idx])
                    idx = j;
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        for (int num: arr){
            System.out.println(num);
        }

    }

    public static void secondWay(int[] arr){
        for (int i = arr.length-1; i >= 0 ; i--) {
            int idx = i;
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[idx]){
                    idx = j;
                }
            }
            System.out.println(arr[idx]+"***");
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (int num: arr){
            System.out.println(num);
        }
    }


    public static void desendingOrder(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[idx])
                    idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        for (int num: arr){
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        secondWay(new int[]{5, 2, 8, 9, 3, 1, 2});

    }
}

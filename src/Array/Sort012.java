package Array;

import java.lang.reflect.Array;

public class Sort012 {

    public void brute(int[] arr){
        //merge sort
    }

    public void better(int[] arr){
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count0++;
            if (arr[i] == 1) count1++;
            if (arr[i] == 2) count2++;
        }

        int j = 0;
        for (j = 0; j < count0; j++) {
            arr[j] = 0;
        }
        for (j = count0; j < count1+count0; j++) {
            arr[j] = 1;
        }
        for (j = count0+count1; j < arr.length; j++) {
            arr[j] = 2;
        }
    }

    public void optimal(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (mid <= high){
            if (arr[mid] == 0){
                swap(arr[low], arr[mid]);
                low++; mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else {
                swap(arr[mid], arr[high]);
                high--;
            }
        }
    }

    public void swap(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }

}

package Array;

import java.lang.reflect.Array;
import java.util.Collections;

public class RotateByDPlaces {

    public void bruteForce(int[] arr, int d){
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
//        int idx = 0;
        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
//            idx++;
        }
        int j = 0;
        for (int i = arr.length-d; i < arr.length; i++) {
            arr[i] = temp[i-(arr.length-d)];
            j++;
        }

    }

    public void betterApproach(int[] arr, int d){
        for (int i = 0; i < d/2; i++) {
            int temp = arr[i];
            arr[i] = arr[d-i-1];
            arr[d-i-1] = temp;
        }

        for (int i = d; i < (arr.length-d)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length-d)-i-1];
            arr[(arr.length-d)-i-1] = temp;
        }

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

    }


}

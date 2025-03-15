package Array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public int bruteForce(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int index = 0;
        for (int num: set){
            arr[index] = num;
            index++;
        }
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }
        return set.size();
    }

    public int optimal(int[] arr){
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}

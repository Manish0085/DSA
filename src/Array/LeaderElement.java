package Array;

import javax.management.InstanceNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderElement {

    public ArrayList<Integer> brute(int[] arr){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            boolean b = false;
            for (int j = i+1; j < n; j++) {
                if (arr[i] < arr[j]){
                    b = true;
                    break;
                }
            }
            if (!b){
                list.add(arr[i]);
            }
        }
        return list;
    }

    public ArrayList<Integer> optimal(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0 ; i--) {
            if (arr[i] > max){
                list.add(arr[i]);
            }
            max = Math.max(max, arr[i]);
        }

        return list;
    }
}

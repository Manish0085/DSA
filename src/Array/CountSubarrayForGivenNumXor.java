package Array;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrayForGivenNumXor {


    public int brute(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int xor = 0;
                for (int k = i; k < j; k++) {
                    xor = xor ^ arr[k];
                }
                if (xor == target)
                    count++;
            }
        }
        return count;
    }

    public int better(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i+1; j < arr.length; j++) {
                xor = xor ^ arr[j];
                if (xor == target)
                    count++;
            }
        }
        return count;
    }


    public int optimal(int[] arr, int target){
        int count = 0, xor = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
            int x = xor ^ target;
            if (map.containsKey(x)){
                count = count + map.get(x);
            }
            if (map.containsKey(xor)){
                map.put(xor, map.get(xor)+1);
            }
            else {
                map.put(xor, 1);
            }
        }
        return count;
    }
}

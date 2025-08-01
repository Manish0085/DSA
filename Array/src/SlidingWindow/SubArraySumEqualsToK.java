package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsToK {

    public int countSubArrays1(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if(sum == target)
                    count++;
            }
        }
        return count;
    }


    public int countSubArrays2(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if(sum == target)
                    count++;
            }
        }
        return count;
    }


    public int countSubArrays3(int[] arr, int target){
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        for (int num: arr){
            sum += num;

            if (map.containsKey(sum-target)){
                count += map.get(sum-target);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}

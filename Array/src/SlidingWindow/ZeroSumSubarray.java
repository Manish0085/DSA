package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubarray {


    // T.C: O(n*n*n)
    // S.C: O(1)
    public int countSubarray1(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i;k < j; k++) {
                    sum += arr[k];
                }
                if(sum == 0)
                    count++;
            }
        }
        return count;
    }

    // T.C: O(n*n)
    // S.C: O(1)
    public int countSubarray2(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0)
                    count++;
            }
        }
        return count;
    }

    // T.C: O(n)
    // S.C: O(n
    public int countSubarray3(int[] arr){
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // if any point of time the sum will be zero
        int sum = 0;
        for (int num: arr) {
            sum += num;
            if (map.containsKey(sum)){
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(map.get(sum), 0)+1);
        }
        return count;
    }
}

package Array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithSumK {

    public int brute(int[] arr, int target){
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                if(sum == target)
                    cnt++;
            }
        }
        return cnt;
    }

    public int better(int[] arr, int target){
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == target){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int optimal(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            int remove = preSum-target;
            cnt += map.getOrDefault(remove, 0);

            map.put(preSum, map.getOrDefault(preSum, 0) + 1);

        }
        return cnt;
    }
}

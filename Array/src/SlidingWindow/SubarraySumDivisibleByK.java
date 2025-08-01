package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumDivisibleByK {

    public int subArraysDivByK1(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += nums[l];
                }
                if (sum % k == 0)
                    count++;
            }
        }
        return count;
    }

    public int subArraysDivByK2(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum % k == 0)
                    count++;
            }
        }
        return count;
    }

    public int subArraysDivByK3 (int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preSum = 0;
        int rem = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            rem = preSum % k;
            if (rem < 0)
                rem += k;  // if reminder is -ve, make it +ve.
            if (map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        
        return count;
    }
}

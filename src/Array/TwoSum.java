package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] bruteForce(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    continue;
                } else if ((arr[i] + arr[j]) == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public int[] better(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int more = target - arr[i];
            if(map.containsKey(more)){
                return new int[]{map.get(more), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public int[] optimal(int[] arr, int target){
        int[][] hash = new int[arr.length][2];

        for (int k = 0; k < arr.length; k++) {
            hash[k][0] = arr[k];
            hash[k][1] = k;
        }

        Arrays.sort(arr);
        int i=0;
        int j= arr.length-1;
        while (i < j){
            int sum = hash[i][0] + hash[j][0];
            if (sum == target){
                return new int[]{hash[i][1], hash[j][1]};
            } else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }
}


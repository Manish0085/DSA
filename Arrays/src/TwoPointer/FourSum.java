package TwoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;

            if ((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) continue;
            if ((long)nums[i] + nums[n-1] + nums[n-2] + nums[n-3] < target) continue;
            for (int j = i+1; j < n - 2; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) continue;

                if ((long)nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) continue;
                if ((long)nums[i] + nums[j] + nums[n-1] + nums[n-2] < target) continue;
                int left = j+1;
                int right = n-1;

                while (left < right) {
                    System.out.println(left);
                    System.out.println(right  + "\n");
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left-1]) left++;
                        while (left < right && nums[right] == nums[right+1]) right--;
                    } else if (sum < target) left++;
                    else right--;
                }
            }
        }
        return ans;
    }

}

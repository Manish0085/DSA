package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums, 0, ans, list);
        return ans;
    }

    public void dfs(int[] nums, int idx, List<List<Integer>> ans, List<Integer> list) {
        if (idx == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        dfs(nums, idx+1, ans, list);


        if (idx < nums.length-1 && nums[idx] == nums[idx+1]) {
            idx++;
        }

        list.remove(list.size()-1);
        dfs(nums, idx+1, ans, list);
    }
}

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        dfs(nums, visited, ans, list);
        return ans;
    }

    public void dfs(int[] nums, boolean[] visited, List<List<Integer>> ans, List<Integer> list) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                list.add(nums[i]);
                visited[i] = true;

                dfs(nums, visited, ans, list);

                visited[i] = false;
                list.remove(list.size()-1);
            }
        }

    }

}

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(candidates, target, 0, ans, list);
        return ans;
    }

    public void dfs(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> list) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx >= candidates.length || target < 0) {
            return;
        }
        list.add(candidates[idx]);
        dfs(candidates, target-candidates[idx], idx, ans, list);

        list.remove(list.size()-1);
        dfs(candidates, target, idx+1, ans, list);
    }
}

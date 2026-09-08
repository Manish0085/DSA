import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubset2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, 0, ans, list);
        return ans;
    }

    public void dfs(int[] nums, int idx, List<List<Integer>> ans, List<Integer> list) {
        if (idx >= nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        dfs(nums, idx+1, ans, list);
        list.remove(list.size()-1);

        int index = idx+1;
        while (index < nums.length && nums[index] == nums[idx])
            index++;

        dfs(nums, index, ans, list);
    }
}

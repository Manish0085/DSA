import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, 0, ans);
        return ans;
    }

    public void dfs(int[] nums, int idx, List<List<Integer>> ans) {
        if (idx == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num: nums)
                list.add(num);

            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, i, idx);
            dfs(nums, idx+1, ans);
            swap(nums, i, idx);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public void dfs2(int[] nums, List<List<Integer>> ans, List<Integer> list, boolean[] used) {
        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;

            used[i] = true;
            list.add(nums[i]);

            dfs2(nums, ans, list, used);

            list.remove(list.size()-1);
            used[i] = false;
        }
    }


}

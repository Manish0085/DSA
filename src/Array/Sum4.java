package Array;

import javax.swing.plaf.SplitPaneUI;
import java.beans.Introspector;
import java.util.*;

public class Sum4 {

    public List<List<Integer>> brute(int[] arr, int target){
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int l = k+1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target){
                            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            Collections.sort(temp);
                            set.add(temp);
                        }
                    }
                }
            }

        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> better(int[] nums, int target){
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                Set<Long> st = new HashSet<>();
                for (int k = j+1; k < n; k++) {
                    long sum = nums[i]+nums[j];
                    sum += nums[k];
                    long forth = target - sum;
                    if (st.contains(forth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) forth);
                        Collections.sort(temp);
                        set.add(temp);
                    }

                    st.add((long)nums[k]);
                }

            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> optimal(int[] nums, int target){
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; j < n; j++) {
                if (j != i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k < l) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        list.add(temp);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1]) k++;
                        while (k < l && nums[l] == nums[l + 1]) l--;
                    }
                }
            }

        }
        return list;
    }
}

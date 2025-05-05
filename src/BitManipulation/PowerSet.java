package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static List<List<Integer>> findPowerSet(int[] arr){
        int subsets = 1 << arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int num = 0; num < subsets-1; num++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length-1; i++) {
                if ((num & (1 << i)) != 0)
                    list.add(arr[i]);
            }
            ans.add(list);
        }
        return ans;
    }
}

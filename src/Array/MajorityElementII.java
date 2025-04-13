package Array;

import javax.swing.event.ListDataEvent;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

    public List<Integer> brute(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    cnt++;
                }
            }
            if (cnt > (nums.length/3) && !list.contains(nums[i]))
                list.add(nums[i]);

        }
        return list;
    }

    public List<Integer> better(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > (nums.length/3)){
                list.add(entry.getKey());
            }
        }
        return list;
    }

    public List<Integer> optimal(int[] nums){
        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && nums[i] != el2){
                cnt1++;
                el1 = nums[i];
            }
            else if (cnt2 == 0 && nums[i] != el1){
                cnt2++;
                el2 = nums[i];
            } else if (nums[i] == el1) {
                cnt1++;
            } else if (nums[i] == el2) {
                cnt2++;
            }
            else{
                cnt1--; cnt2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        cnt2 = 0; cnt1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int freq = (nums.length/3) + 1;
        if (cnt1 >= freq){
            list.add(el1);
        }

        if (cnt2 >= freq){
            list.add(el2);
        }

        return list;
    }
}

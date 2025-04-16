package Array;

import javax.management.InstanceNotFoundException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MergeOverlappingSubIntervals {

    public List<List<Integer>> brute(int[][] arr){
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];
            if (!list.isEmpty() && end <= list.get(list.size()-1).get(1)){
                continue;
            }

            for (int j = i+1; j < n; j++) {
                if (arr[j][0] <= end){
                    end = Math.max(end, arr[j][1]);
                }
                else {
                    break;
                }
            }
            list.add(Arrays.asList(start, end));
        }
        return list;
    }

    public List<List<Integer>> better(int[][] arr){
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (list.isEmpty() || arr[i][0] > list.get(list.size()-1).get(1)){
                list.add(new ArrayList<>(Arrays.asList(arr[i][0], arr[i][1])));
            }
            else {
                list.get(list.size()-1).set(1, Math.max(arr[i][1], list.get(list.size()-1).get(1)));

            }
        }
        return list;
    }
    
}

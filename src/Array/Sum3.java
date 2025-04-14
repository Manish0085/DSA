package Array;

import javax.swing.*;
import java.beans.Introspector;
import java.util.*;

public class Sum3 {

    public List<List<Integer>> brute(int[] arr){

        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }

            }

        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> better(int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i+1; j < n; j++) {
                int third = -(arr[i]+arr[j]);

                if(st.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    set.add(temp);
                }
                st.add(arr[j]);
            }

        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> optimal(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int j = i+1;
            int k = n-1;
            while (j < k){
                int sum = arr[i] + arr[j] + arr[k];

                if(sum > 0){
                    k--;
                }
                else if (sum < 0){
                    j++;
                }

                else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    list.add(temp);
                    j++;
                    k--;
                    while (j < k && arr[j] == arr[j-1]) j++;
                    while (j < k && arr[k] == arr[k+1]) k--;
                }
            }

        }
        return list;
    }
}

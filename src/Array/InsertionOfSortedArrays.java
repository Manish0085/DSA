package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class InsertionOfSortedArrays {

    public ArrayList<Integer> brute(int[] a, int[] b){
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visit = new int[b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && visit[j] == 0){
                    ans.add(a[i]);
                    visit[j] = 1;
                    break;
                }
            }
        }
        return ans;
    }

    public ArrayList<Integer> better(int[] a, int[] b){
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int num : a){
            set.add(num);
        }

        for (int num: b){
            if (set.contains(num)){
                ans.add(num);
                set.remove(num);
            }
        }

        return ans;
    }

    public ArrayList<Integer> optimal(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n && j < m){
            if(a[i] < b[j]){
                i++;
            } else if (b[j] < a[i]) {
                j++;
            }
            else {
                ans.add(a[i]);
                i++; j++;
            }
        }
        return ans;
    }
}

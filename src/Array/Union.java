package Array;

import java.util.*;

public class Union {

    public void bruteForce(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;

        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(arr2[i]);
        }

        int[] union = new int[set.size()];
        int j = 0;
        for (int num : set){
            union[j] = num;
            j++;
        }
        System.out.println();
        for (int num : union){
            System.out.print(num+" ");
        }
    }

    public void optimal(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n && j < m){
            if(a[i] <= b[j]){
                if(list.size() == 0 || list.get(list.size()-1) != a[i])
                    list.add(a[i]);
                i++;
            }

            else {
                if(list.size() == 0 || list.get(list.size()-1) != b[j])
                    list.add(b[j]);
                j++;
            }


        }

        while (i < n){
            if(list.size() == 0 || list.get(list.size()-1) != a[i])
                list.add(a[i]);
            i++;
        }

        while (j < m){
            if(list.size() == 0 || list.get(list.size()-1) != b[j])
                list.add(b[j]);
            j++;
        }
    }
}

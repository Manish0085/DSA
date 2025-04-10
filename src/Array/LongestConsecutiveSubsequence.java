package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

    public int brute(int[] arr){
        int n = arr.length;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr, x+1)){
                x += 1;
                count += 1;
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }

    public boolean linearSearch(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return true;
        }

        return false;
    }

    public int better(int[] arr){
        int longest = 1;
        int count = 0;
        int lastSmaller = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == lastSmaller){
                count++;
                lastSmaller = arr[i];
            } else if (arr[i] != lastSmaller) {
                count = 0;
                lastSmaller = arr[i];
            }

            longest = Math.max(longest, count);
        }
        return longest;
    }

    public int optimal(int[] arr){
        int n = arr.length;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int it : set) {
            if (!set.contains(it-1)){
                int count = 1;
                int x = it;
                while (set.contains(x+1)){
                    count += 1;
                    x += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}

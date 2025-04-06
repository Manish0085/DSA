package Array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArray {

    public int[] bruteForce(int[] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                pos.add(arr[i]);
            }
            else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < arr.length/2; i++) {
            arr[2*i] = pos.get(i);
            arr[2*i+1] = neg.get(i);

        }
        return arr;
    }


    public int[] optimal(int[] arr){
        int[] ans = new int[arr.length];
        int pos = 0, neg = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                ans[neg] = arr[i];
                neg += 2;
            }
            else {
                ans[pos] = arr[i];
                pos += 2;
            }
        }
        return ans;
    }


}

package Array;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayWithDiffPosNeg {


    public int[] brute(int[] arr){

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

        if (pos.size() > neg.size()){
            for (int i = 0; i < neg.size(); i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int idx1 = neg.size()*2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[idx1] = pos.get(i);
                idx1++;
            }
        }
        else {
            for (int i = 0; i < pos.size(); i++) {
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int idx1 = pos.size()*2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[idx1] = neg.get(i);
                idx1++;
            }
        }
        return arr;
    }
}

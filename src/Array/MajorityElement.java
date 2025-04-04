package Array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    
    public int bruteForce(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]){
                    count++;
                }
            }
            if (count  > (n/2)){
                return arr[i];
            }
        }
        return -1;
    }

    public int better(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > arr.length/2){
                return entry.getKey();
            }
        }
        return -1;
    }


    public int optimal(int[] arr){
        int count = 0;
        int el = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0){
                count = 1;
                el = arr[i];
            } else if (arr[i] == el) {
                count++;
            }
            else {
                count--;
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el){
                cnt++;
            }
        }
        return (cnt > arr.length/2)? el: -1;
    }
}

package Array;

import java.util.Arrays;

public class FindAppearsOnce {

    public int brute(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(num == arr[j])
                    count++;
            }
            if(count == 1){
                return num;
            }
        }
        return -1;
    }

    public int better(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] hash = new int[max+1];
        Arrays.fill(hash, 0);
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }
        for (int i = 0; i < n; i++) {
            if(hash[arr[i]] == 1)
                return arr[i];
        }
        return -1;
    }
}

package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingNumber {

    public int bruteForce(int[] arr){
        for (int i = 1; i <= arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] == i){
                    flag = true;
                    break;
                }
            }
            if (!flag){
                return i;
            }
        }
        return arr.length;
    }

    public int better(int[] arr){
        int[] hash = new int[arr.length+1];
        Arrays.fill(hash, 0);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr.length+1)
                hash[arr[i]] = 1;
        }
        for (int i = 1; i < arr.length+1; i++) {
            if (hash[i] == 0)
                return i;
        }
        return arr.length+1;
    }

    public int optimal1(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        int sum1 = 0;
        for (int num: arr){
            sum1 += num;
        }
        return sum-sum1;
    }

    public int optimal(int[] arr){
         int xor1 = 0;
//        for (int i = 1; i < arr.length; i++) {
//            xor1 ^= i;
//        }
        int xor2 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            xor2 ^= arr[i];
            xor1 ^= (i+1);
        }
        xor1 ^= arr.length;
        return xor1^xor2;
    }
}

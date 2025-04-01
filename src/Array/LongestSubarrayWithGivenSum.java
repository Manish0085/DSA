package Array;

public class LongestSubarrayWithGivenSum {


    public int bruteForce1(int[] arr, int m){
        int len = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                    if (sum == m){
                        len = Math.max(len, j-i+1);
                    }
                }
            }
        }
        return len;
    }

    public int bruteForce2(int[] arr, int m){
        int len = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == m){
                    len = Math.max(len, j-i+1);
                }

            }
        }
        return len;
    }

    public int optimal(int[] arr, int k){
        int i = 0;
        int j = 0;
        int sum = arr[0];
        int len = 0;
        while (j < arr.length){
            while (i <= j && sum > k){
                sum -= arr[i];
                i++;
            }
            if (sum == k){
                len = Math.max(len, j-i+1);
            }
            j++;
            if (j < arr.length)
                sum += arr[i];
        }
        return len;
    }
}

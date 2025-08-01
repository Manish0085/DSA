package SlidingWindow;

public class ZeroSumSubarray {


    // T.C: O(n*n*n)
    // S.C: O(1)
    public int countSubarray1(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i;k < j; k++) {
                    sum += arr[k];
                }
                if(sum == 0)
                    count++;
            }
        }
        return count;
    }

    // T.C: O(n*n)
    // S.C: O(1)
    public int countSubarray2(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 0)
                    count++;
            }
        }
        return count;
    }
}

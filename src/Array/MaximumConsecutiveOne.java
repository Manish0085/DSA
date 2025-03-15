package Array;

public class MaximumConsecutiveOne {

    public int optimal(int[] arr){
        int n = arr.length;
        int max = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1){
                count++;
                max = Math.max(max, count);
            }
            else {
                count = 0;
            }
        }

        return max;
    }
}

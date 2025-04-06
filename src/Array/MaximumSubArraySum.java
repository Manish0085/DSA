package Array;

public class MaximumSubArraySum {


    public int bruteForce(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                max = Math.max(max, sum);
            }

        }
        return max;
    }


    public int better(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += arr[k];
                }
                max = Math.max(max, sum);
            }

        }
        return max;
    }

    public int optimal(int[] arr){
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > max){
               max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        if (max < 0){
            max = 0;
        }
        return max;
    }
}

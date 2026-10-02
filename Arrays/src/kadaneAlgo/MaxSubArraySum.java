package kadaneAlgo;

public class MaxSubArraySum
{
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += nums[k];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public int maxSubArray2(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public int maxSubArray23(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 1; i < nums.length; i++) {
            if(currSum < 0) {
                max = Math.max(max, currSum);
                currSum = 0;
            } else {
                currSum += nums[i];
            }
        }
        return max;
    }
}

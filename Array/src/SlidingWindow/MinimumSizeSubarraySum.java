package SlidingWindow;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen1(int target, int[] nums) {

        int length = nums.length+1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (sum >= target)
                    length = Math.min(length, j-i+1);
            }
        }
        return (length == nums.length+1)? 0: length;

    }


    public int minSubArrayLen2(int target, int[] nums) {

        int length = nums.length+1;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target)
                    length = Math.min(length, j-i+1);
            }
        }
        return (length == nums.length+1)? 0: length;

    }

    public int minSubArrayLen3(int target, int[] nums) {

        int length = nums.length+1;
        int first = 0;
        int second = 0;
        int sum = 0;

        while(second < nums.length){
            sum += nums[second];
            while (sum >= target){
                length = Math.min(length, second - first - 1);
                sum -= nums[first];
                first++;
            }
            second++;
        }
        return (length == nums.length+1)? 0: length;

    }


}

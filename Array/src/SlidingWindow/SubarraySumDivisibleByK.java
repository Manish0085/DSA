package SlidingWindow;

public class SubarraySumDivisibleByK {

    public int subArraysDivByK1(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += nums[l];
                }
                if (sum % k == 0)
                    count++;
            }
        }
        return count;
    }

    public int subArraysDivByK2(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum % k == 0)
                    count++;
            }
        }
        return count;
    }
}

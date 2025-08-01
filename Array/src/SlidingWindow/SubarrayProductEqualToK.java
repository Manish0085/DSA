package SlidingWindow;

public class SubarrayProductEqualToK {


    public int subArraysProdLessThanK1(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int prod = 1;
                for (int l = i; l <= j; l++) {
                    prod *= nums[l];
                }
                if (prod > k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }

    public int subArraysProdLessThanK2(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod *= nums[i];

                if (prod < k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }


    public int subArraysProdLessThanK3(int[] nums, int k) {
        int count = 0;
        int start = 0;
        int end = 0;
        int prod = 1;
        while (end < nums.length){
            prod *= nums[end];
            while (prod >= k){
                prod /= nums[start];
                start++;
            }

            count = end - start + 1;
            end++;

        }
        return count;
    }


}

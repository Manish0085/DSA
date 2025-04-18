package BinarySeach;

public class FindSmallestDivisor
{

    public int brute(int[] nums, int threshold){
        int m = findMax(nums);
        for (int i = 1; i <= m; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += Math.ceil((double) nums[j]/i);
            }
            if (sum <= threshold)
                return i;
        }
        return -1;
    }

    private int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(i, max);
        }

        return max;
    }


    public int optimal(int[] nums, int threshold){
        int low = 1;
        int high = findMax(nums);
        if (nums.length > threshold)
            return -1;

        while (low <= high){
            int mid = (low + high)/2;
            if (sumByD(nums, mid) <= threshold){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    private int sumByD(int[] nums, int d){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i]/d);
        }
        return sum;
    }
}

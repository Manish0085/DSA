public class MinInRotSortedArray {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        if(nums[low] < nums[high])
            return nums[low];

        int ans = Integer.MAX_VALUE;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else  {
                high = mid;
            }
        }
        return ans;
    }
}

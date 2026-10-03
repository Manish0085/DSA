public class LowerUpperBound {

    public int lowerBound(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int lower = nums.length;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] >= target) {
                lower = mid;
                high = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return lower;
    }

    public int upperBound(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        int upper = nums.length;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                upper = mid;
                upper = mid - 1;
            }
        }
        return upper;
    }
}

public class FirstAndLastIndex {

    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums, target), last(nums, target)};
    }

    public int first(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int first = -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                first = mid;
                right = mid-1;
            } else if(target < nums[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return first;
    }

    public int last(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int last = -1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                last = mid;
                left = mid+1;
            } else if(target < nums[mid]){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return last;
    }
}

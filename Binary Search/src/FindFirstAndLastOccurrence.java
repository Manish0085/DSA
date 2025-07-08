public class FindFirstAndLastOccurrence {

    public int findFirstOccurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == target){
                if (mid == 0 || arr[mid - 1] != target){
                    return mid;
                }
                else {
                    high = mid - 1;
                }
            }
            else if (arr[mid] > mid){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int findLastOccurrence(int[] nums, int key){

        int low = 0;
        int high = nums.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == key){
                if (mid == nums.length-1 || nums[mid + 1] != key){
                    return mid;
                }
                else {
                    low = mid + 1;
                }
            } else if (nums[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

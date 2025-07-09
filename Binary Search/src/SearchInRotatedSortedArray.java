public class SearchInRotatedSortedArray {

    public int brute(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int usingBinarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == target){
                return mid;
            }
            else if(arr[0] < arr[mid]){
                if (arr[low] <= target && arr[mid] >= target){
                    high = mid -1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {
                if (arr[mid] <= target && arr[high] >= target){
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}

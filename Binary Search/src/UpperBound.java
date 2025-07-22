public class UpperBound {

    public int findUpperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int idx = arr.length;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target){
                idx = mid;   // You can do Like (idx = mid + 1)
                low  = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return idx+1;   // then you will return idx;
    }
}

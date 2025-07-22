public class LowerBound {


    public int findLowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int idx = arr.length;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target){
                idx = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return idx;
    }
}

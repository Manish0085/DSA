public class KthMissingPositiveNumber {

    public int findKthMissing(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] - mid - 1 >= k){
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans+k;
    }
}

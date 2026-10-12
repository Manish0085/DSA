public class RotationCount {

    public int findKRotation(int arr[]) {
        int low = 0;
        int high = arr.length-1;
        if(arr[low] < arr[high]) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int index = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[low] <= arr[mid]) {
                if(arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return index;
    }
}

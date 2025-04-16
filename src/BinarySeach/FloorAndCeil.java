package BinarySeach;

public class FloorAndCeil {


    public int[] floorAndCeil(int[] arr, int target){
        return new int[]{floor(arr, target), ceil(arr, target)};
    }
    public int floor(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] >= target){
                ans = arr[mid];
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int ceil(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

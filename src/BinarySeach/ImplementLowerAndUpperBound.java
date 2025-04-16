package BinarySeach;

public class ImplementLowerAndUpperBound {

    public int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] >= target){
                ans = mid;
                high = mid -1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }


    public int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int ans = arr.length;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] > target){
                ans = mid;
                high = mid - 1;

            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }
}

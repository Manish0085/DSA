package BinarySeach;

public class IterativeApproach {

    public int search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int result = -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == target){
                result = mid;  // find first occurrence of  the target
                high = mid - 1;
            }

            else if (arr[mid] < target){
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return result;
    }
}

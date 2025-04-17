package BinarySeach;

public class FindMinimumInRotatedSortedArray {

    public int findMinimum(int[] arr){
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[low] <= arr[high]){
                min = Math.min(arr[low], min);
                break;
            } else if (arr[low] <= arr[mid]) {
                min = Math.min(min, arr[low]);
            }
            else {
                min = Math.min(min, arr[mid]);
            }
        }

        return min;
    }
}


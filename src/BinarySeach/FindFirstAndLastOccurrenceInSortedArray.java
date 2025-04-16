package BinarySeach;

public class FindFirstAndLastOccurrenceInSortedArray {


    public int[] find(int[] arr, int target){
        int first = findFirst(arr, target);
        if (first == -1)
            return new int[]{-1, -1};
        return new int[]{first, findLast(arr, target)};
    }


    public int findFirst(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int first = -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if (arr[mid] > target){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return first;
    }

    public int findLast(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int last = -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == target){
                last = mid;
                low = mid + 1;
            }

            else if (arr[mid] > target){
                high = mid - 1;
            }
            else {
                low = low + 1;
            }
        }
        return last;
    }

    //Use Lower & Upper Bound concept

    public int findLower(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int lower = arr.length;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] >= target){
                lower = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return lower;
    }

    public int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int upper = arr.length;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] > target){
                upper = mid;
                low = mid+1;
            }
            else {
                high = mid - 1;
            }
        }
        return upper;
    }
}

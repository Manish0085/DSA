public class Recursive {

    public int binarySearch(int[] arr, int target) {
        return search(arr, 0, arr.length-1, target);
    }

    public int search(int[] arr, int left, int right, int target) {
        if (left > right)
            return - 1;

        int mid = left + (right - left)/2;
        if(arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return search(arr, left, mid-1, target);
        else
            return search(arr, mid+1, right, target);
    }
}

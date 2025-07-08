public class FindFirstOccurrenceOfKey {


    public static int search(int[] arr, int key){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == key){
                if (mid == 0 || arr[mid - 1] != key){
                    return mid;
                }
                else {
                    high = mid - 1;
                }
            }
            else if (arr[mid] > key){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

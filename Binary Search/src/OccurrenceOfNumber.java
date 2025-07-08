public class OccurrenceOfNumber {

    public int countOccurrence(int[] arr, int target){
        if(findFirstIndex(arr, target) == -1 && findLastIndex(arr, target) == -1){
            return 0;
        }

        return findLastIndex(arr, target) - findFirstIndex(arr, target)+1;
    }

    public int findFirstIndex(int[] arr, int key){
        int first = -1;
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == key) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return first;
    }

    public int findLastIndex(int[] arr, int key){
        int last = -1;
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key){
                last = mid;
                low = mid + 1;
            }
            else if (arr[mid] > key){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return last;
    }
}

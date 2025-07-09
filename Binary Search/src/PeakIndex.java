public class PeakIndex {


    public int bruteForce(int[] arr){

        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = i;
            }
        }
        return max;
    }


    public int findPeakIndex(int[] arr){
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = high + (low - high)/2;

            if (arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

public class FindMinimumInRotatedArray {

    public int bruteForce(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }


    public int usingBinarySearch(int[] arr){
         int low = 0;
         int high = arr.length-1;
         int ans = arr[0];
         while (low <= high){
             int mid = low + (high -low)/2;
             if (arr[mid] >= arr[0]){
                 low = mid+1;
             }
             else {
                 ans = arr[mid];
                 high = mid-1;
             }
         }
         return ans;
    }
}

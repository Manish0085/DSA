public class CountZeros {

    public static int findFirst(int[] arr){
        int first = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == 0){
                first = mid;
                high = mid - 1;
            }
            else if (arr[mid] > 0){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return first;
    }


    public static int findLast(int[] arr){
        int last = -1;
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == 0){
                last = mid;
                low = mid + 1;
            }
            else if (arr[mid] > 0){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 0};
        int n = findLast(arr) - findFirst(arr)+1;
        System.out.println(n);
    }
}

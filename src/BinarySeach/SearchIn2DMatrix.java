package BinarySeach;

public class SearchIn2DMatrix {

    public boolean bruteForce(int[][] arr, int key){
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == key)
                    return true;
            }
        }
        return false;
    }

    public boolean better(int[][] arr, int key){
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if(arr[i][0] < key && arr[i][m-1] > key){
                return binarySearch(arr[i], key);
            }
        }
        return false;
    }

    private boolean binarySearch(int[] arr, int key){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == key)
                return true;
            else if (arr[mid] > key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return false;
    }
}

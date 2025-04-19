package BinarySeach;

import java.util.Arrays;

public class AggressiveCows {

    public int brute(int[] arr, int cows){
        Arrays.sort(arr);
        int n = arr.length;
        int m = arr[n-1] - arr[0];
        for (int i = 1; i <= m; i++) {
            if(canWePlace(arr, i, cows)){
                continue;
            }
            else {
                return i-1;
            }
        }
        return -1;
    }

    private boolean canWePlace(int[] arr, int dist, int cows){
        int last = arr[0], cow = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - last >= dist){
                last = arr[i];
                cow++;
            }

        }
        if (cows <= cow){
            return true;
        }
        return false;
    }

    public int optimal(int[] arr, int cows){
        int n = arr.length;
        Arrays.sort(arr);
        int low = 1, high = arr[n] - arr[0];
        while (low <= high){
            int mid = (low + high)/2;
            if (canWePlace(arr, mid, cows)){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return high;
    }
}

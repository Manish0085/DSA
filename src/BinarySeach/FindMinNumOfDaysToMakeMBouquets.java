package BinarySeach;

public class FindMinNumOfDaysToMakeMBouquets {

    public int brute(int[] arr, int m, int k){
        int n = arr.length;
        if (m * k > n){
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if(possibleDay(arr, i, m, k))
                return i;
        }
        return -1;
    }

    private boolean possibleDay(int[] arr, int day, int m, int k){
        int count = 0;
        int bouquet = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= day){
                count++;
            }
            else {
                bouquet += (count/k);
                count = 0;
            }
        }
        bouquet += (count/k);
        if (bouquet >= m){
            return true;
        }
        else {
            return false;
        }
    }

    private int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return min;
    }

    private int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public int optimal(int[] arr, int m, int k){
        int low = findMin(arr);
        int high = findMax(arr);
        int ans = high;

        while (low <= high){
            int mid = (low + high)/2;
            if(possibleDay(arr, mid, m, k)){
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}

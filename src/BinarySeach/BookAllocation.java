package BinarySeach;

public class BookAllocation
{

    public int linearApproach(int[] arr, int k){
        if(arr.length < k)
            return -1;
        int n = findMax(arr);
        int m = sum(arr);

        for (int i = n; i <= m; i++) {
            if (findStudent(arr, i) == k){
                return i;
            }
        }
        return -1;
    }

    public int binaryApproach(int[] arr, int k){
        if(arr.length < k)
            return -1;
        int low = findMax(arr), high = sum(arr);
        int res = -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (findStudent(arr, mid) <= k){
                res = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
    private int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num: arr){
            max = Math.max(num, max);
        }
        return max;
    }

    private int sum(int[] arr){
        int sum =0;
        for (int num: arr){
            sum += num;
        }
        return sum;
    }

    private int findStudent(int[] arr, int pages){
        int st = 1;
        int page = 0;
        for (int i = 0; i < arr.length; i++) {
            if (page+arr[i] <= page){
                page += arr[i];
            }
            else {
                st++;
                page = arr[i];
            }
        }
        return st;
    }
}

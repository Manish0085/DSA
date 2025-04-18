package BinarySeach;

public class FindNthRootOfAnInteger {

    public int brute(int m, int n){
        for (int i = 1; i <= m; i++) {
            if (Math.pow(i, n) == m){
                return i;
            }
            else if (Math.pow(i, n) > m){
                break;
            }

        }
        return -1;
    }

    public int optimal(int m, int n ){
        int low = 1, high = m;
        while (low<= high){
            int mid = (low + high)/2;
            double power = Math.pow(mid, n);
            if (power == m)
                return mid;
            else if (power > m)
                high = mid -1;
            else
                low = mid + 1;
        }
        return -1;
    }
}

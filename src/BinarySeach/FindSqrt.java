package BinarySeach;

public class FindSqrt {

    public int usingInBuilt(int x){
        return (int) Math.sqrt(x);
    }

    public int brute(int num){
        int ans = 0;
        for (int i = 1; i < num ; i++) {
            if (i <= num/2){
                ans = i;
            }
            else {
                break;
            }
        }
        return ans;
    }

    public int optimal(int num){
        int ans = 1;
        if (num == 0){
            return 0;
        }
        int low = 1, high = num;
        while (low <= high){
            int mid = (low + high)/2;
            if (mid <= num/mid){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
}

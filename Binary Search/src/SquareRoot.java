public class SquareRoot {

    public static int findSqrt(int x){
        if (x < 2)
            return x;
        int low = 1;
        int high = x;
        int ans = -1;

        while (low <= high){
            int mid = low + (high - low)/2;
            if ((x/mid) == mid){
                return mid;
            } else if ((x/mid) > mid) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findSqrt2(int x){

        if (x < 2)
            return x;

        int low = 1;
        int high = x;
        while (low <= high){
            int mid = low + (high - low)/2;
            if ((x/mid) >= mid){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return low-1;
    }

    public static void main(String[] args) {
        System.out.println(findSqrt2(7));
    }
}

package BinarySeach;

public class KokoEatingBanana {

    private int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int num : arr){
            max = Math.max(num, max);
        }

        return max;
    }


    public int findSpeed(int[] piles, int hour){
        int low = 1;
        int high = max(piles);
        while (low <= high){
            int mid = (low + high)/2;
            int reqHour = calcualteHour(piles, mid);
            if (reqHour <= hour){
                high = mid-1;
            }
            else {
                low = mid - 1;
            }
        }
        return low;
    }

    private int calcualteHour(int[] piles, int hour) {
        int total = 0;
        for (int i = 0; i < piles.length; i++) {
            total += Math.ceil((double) piles[i]/hour);
        }

        return total;
    }
}

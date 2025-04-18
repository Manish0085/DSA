package BinarySeach;

import java.beans.Introspector;

public class ShipPackagesWithinDDays {

    private int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int n: arr){
            max = Math.max(n, max);
        }
        return max;
    }

    private int sum(int[] arr){
        int sum = 0;
            for (int n: arr){
            sum += n;
        }
        return sum;
    }

    public int optimal(int[] weights, int days){
        int n = weights.length;
        if (n > days)
            return -1;
        int low = findMax(weights);
        int high = sum(weights);
        while (low <= high){
            int mid = (low + high)/2;
            int d = leastReqDay(weights, mid);
            if (d <= days)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public int brute(int[] weights, int days){
        int n = findMax(weights);
        int m = sum(weights);
        for (int i = n; i < m; i++) {
            int reqDay = leastReqDay(weights, i);
            if (reqDay <= days){
                return i;
            }
        }
        return -1;
    }

    private int leastReqDay(int[] weights, int cap) {
        int load = 0, day = 1;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > cap){
                day += 1;
                load += weights[i];
            }
            else {
                load += weights[i];
            }
        }
        return day;
    }
}

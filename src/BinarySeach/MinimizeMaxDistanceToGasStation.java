package BinarySeach;

import java.util.PriorityQueue;

public class MinimizeMaxDistanceToGasStation {

    public static class Pair{
        double first;
        int second;

        Pair(double first, int second){
            this.first = first;
            this.second = second;
        }
    }



    public double bruteFore(int[] stations, int k){
        int n = stations.length;
        int[] howMany = new int[n-1];
        for (int gas = 0; gas < k; gas++) {
            int maxIdx = -1;
            double maxVal = -1;
            for (int i = 0; i < n-1; i++) {
                double diff = stations[i+1] - stations[i];
                double sectionLen = diff/(double) (howMany[i]+1);
                if (sectionLen > maxVal){
                    maxVal = sectionLen;
                    maxIdx = i;
                }
            }
            howMany[maxIdx]++;
        }
        double max = -1;
        for (int i = 0; i < n-1; i++) {
            double d = stations[i+1]-stations[i];
            double secLen = d/(double) (howMany[i]+1);
            max = Math.max(max, secLen);
        }
        return max;
    }



    public double betterApproach(int[] arr, int k){
        int n = arr.length;
        int[] howMany = new int[n-1];

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.first, a.first));
        for (int i = 0; i < n-1; i++) {
            pq.add(new Pair(arr[i+1]-arr[i], i));
        }

        for (int gas = 0; gas < k; gas++) {

            Pair p = pq.poll();
            int idx = p.second;

            howMany[idx]++;

            double diff = arr[idx+1] - arr[idx];
            double newLen = diff/(double) (howMany[idx]+1);

            pq.add(new Pair(newLen, idx));
        }

        return pq.peek().first;

    }


    public double optimal(int[] arr, int k){
        int n =arr.length;
        double diff = 1e-6;
        double low = 0;
        double high = 0;
        for (int i = 0; i < n-1; i++) {
            high = Math.max((double) arr[i+1] - arr[i], high);
        }
        double ans = 0.0;
        while (low - high > diff){
            double mid = (low + high)/2.0;
            int count = getRequiredGasStations(arr, mid );
            if (count > k){
                low = mid;
            }
            else{
                ans = high;
                high = mid;
            }
        }
        return high;
    }

    private int getRequiredGasStations(int[] arr, double dist) {

        int n = arr.length; // size of the array
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int numberInBetween = (int)((arr[i] - arr[i - 1]) / dist);
            if ((arr[i] - arr[i - 1]) == (dist * numberInBetween)) {
                numberInBetween--;
            }
            cnt += numberInBetween;
        }
        return cnt;
    }
}

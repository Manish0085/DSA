import java.util.Arrays;

public class MaximumNumberOfEventsThatCanBeAttended {

    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[1], b[1]));

        int ans = 1;
        int endDay = events[0][1];
        int time = events[0][1] - events[0][0];
        for (int i=1; i<events.length; i++) {
            if(endDay <= events[i][0]) {
                ans++;
                endDay = events[i][1];
            }
        }
        return ans;
    }
}

import java.util.Arrays;
import java.util.PriorityQueue;

class Triple {
    int effort;
    int row;
    int col;

    public Triple(int effort, int row, int col) {
        this.effort = effort;
        this.row = row;
        this.col = col;
    }
}
public class PathWithMinEffort {

    public static int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int[][] dist = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], (int)(1e9));
        }
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        PriorityQueue<Triple> pq = new PriorityQueue<>((a, b) -> a.effort - b.effort);
        pq.offer(new Triple(0, 0, 0));
        dist[0][0] = 0;
        while (!pq.isEmpty()) {
            Triple triple = pq.poll();
            int effort = triple.effort;
            int row = triple.row;
            int col = triple.col;

            System.out.println("Effort: " + effort);
            if (row == n-1 && col == m-1)
                return effort;

            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {

                    int currentEffort = Math.abs(heights[row][col] - heights[nrow][ncol]);
                    int newEffort = Math.max(effort, currentEffort);
                    if (newEffort < dist[nrow][ncol]) {
                        dist[nrow][ncol] = newEffort;
                        pq.offer(new Triple(newEffort, nrow, ncol));
                        System.out.println("Dist[" + nrow + "][" + ncol + "]: " + dist[nrow][ncol]);
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] heights = {
                {1,2,2},
                {3,8,2},
                {5,3,5}
        };
        int ans = minimumEffortPath(heights);
        System.out.println(ans);
    }
}

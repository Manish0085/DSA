import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] == 1)
            return -1;
        boolean[][] visited = new boolean[n][n];
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{0, 0, 0});

        visited[0][0] = true;

        while (!que.isEmpty()) {
            int[] cell = que.poll();
            int row = cell[0];
            int col = cell[1];
            int dist = cell[2];

            if (row == n-1 && col == n-1)
                return dist+1;

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int nrow = row + i;
                    int ncol = col + j;

                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < n) {
                        if (!visited[nrow][ncol] && grid[nrow][ncol] == 0) {
                            visited[nrow][ncol] = true;
                            que.offer(new int[]{nrow, ncol, dist+1});
                        }
                    }
                }
            }
        }
        return -1;
    }
}

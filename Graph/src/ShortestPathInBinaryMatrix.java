import java.util.LinkedList;
import java.util.Queue;

class Triplet {
    int row;
    int col;
    int steps;
    public Triplet (int row, int col, int steps) {
        this.steps = steps;
        this.row = row;
        this.col = col;
    }
}
public class ShortestPathInBinaryMatrix {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] == 1)
            return -1;
        boolean[][] visited = new boolean[n][n];
        Queue<Triplet> que = new LinkedList<>();
        que.offer(new Triplet(0, 0, 0));
        visited[0][0] = true;

        while (!que.isEmpty()) {
            Triplet triplet = que.poll();
            int row = triplet.row;
            int col = triplet.col;
            int steps = triplet.steps;

            if (row == n-1 && col == n-1)
                return steps+1;

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int nrow = row + i;
                    int ncol = col + j;

                    if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < n) {
                        if (!visited[nrow][ncol] && grid[nrow][ncol] == 0) {
                            visited[nrow][ncol] = true;
                            que.offer(new Triplet(nrow, ncol, steps+1));
                        }
                    }
                }
            }
        }
        return -1;
    }
}

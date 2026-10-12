package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix01
{
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        boolean[][] visited = new boolean[n][m];

        Queue<int[]> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    visited[i][j] = true;
                    que.offer(new int[]{i, j, 0});
                }
            }
        }

        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        while (!que.isEmpty()) {
            int[] cell = que.poll();
            int row = cell[0];
            int col = cell[1];
            int dist = cell[2];

            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                    if (!visited[nrow][ncol] && mat[nrow][ncol] == 1) {
                        visited[nrow][ncol] = true;
                        mat[nrow][ncol] = dist + 1;
                        que.offer(new int[]{nrow, ncol, dist+1});
                    }
                }
            }
        }
        return mat;
    }
}

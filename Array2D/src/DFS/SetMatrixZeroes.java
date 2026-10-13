package DFS;

import java.lang.reflect.ParameterizedType;
import java.util.LinkedList;
import java.util.Queue;

public class SetMatrixZeroes {


    public void setZeroes2(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if(matrix[row][col] == 0) {
                    rows[row] = true;
                    cols[col] = true;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if(rows[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = 0;
                }
            }
        }


        for (int j = 0; j < m; j++) {
            if (cols[j]) {
                for (int i = 0; i < n; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<int[]> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    que.offer(new int[]{i, j});
                    visited[i][j] = true;
                }
            }
        }

        while (!que.isEmpty()) {
            int[] cell = que.poll();
            int row = cell[0];
            int col = cell[1];

            for(int i=0; i<row; i++) {
                matrix[i][col] = 0;
            }

            for(int i=row; i<n; i++) {
                matrix[i][col] = 0;
            }

            for (int j = 0; j < col; j++) {
                matrix[row][j] = 0;
            }
            for (int j = col; j < m; j++) {
                matrix[row][j] = 0;
            }
        }
    }
}

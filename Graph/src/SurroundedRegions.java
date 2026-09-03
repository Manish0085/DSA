import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SurroundedRegions {

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            if (!visited[i][0] && board[i][0] == 'O') {
                dfs(board, visited, i, 0);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i][m-1] && board[i][m-1] == 'O') {
                dfs(board, visited, i, m-1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (!visited[0][j] && board[0][j] == 'O') {
                dfs(board, visited, 0, j);
            }
        }

        for (int j = 0; j < m; j++) {
            if (!visited[n-1][j] && board[n-1][j] == 'O') {
                dfs(board, visited, n-1, j);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    private void dfs(char[][] board, boolean[][] visited, int row, int col) {
        int n = board.length;
        int m = board[0].length;

        visited[row][col] = true;

        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                if (!visited[nrow][ncol] && board[nrow][ncol] == 'O')
                    dfs(board, visited, nrow, ncol);
            }
        }
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        int n = heights.length;
        int m = heights[0].length;

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            if (!pacific[i][0]) {
                dfs(heights, pacific, i, 0);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!atlantic[i][m-1]) {
                dfs(heights, atlantic, i, m-1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (!pacific[0][j]) {
                dfs(heights, pacific, 0, j);
            }
        }

        for (int j = 0; j < m; j++) {
            if (!atlantic[n-1][j]) {
                dfs(heights, atlantic, n-1, j);
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pacific[i][j] && atlantic[i][j])
                    ans.add(new ArrayList<>(Arrays.asList(i, j)));
            }
        }
        return ans;
    }

    public void dfs(int[][] heights, boolean[][] visited, int row, int col) {
        int n = heights.length;
        int m = heights[0].length;

        visited[row][col] = true;

        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                if (!visited[nrow][ncol] && heights[row][col] <= heights[nrow][ncol]) {
                    dfs(heights, visited, nrow, ncol);
                }
            }
        }
    }
}

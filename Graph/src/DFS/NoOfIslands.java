public class NoOfIslands {

    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    ans++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return ans;
    }


    public static void dfs(char[][] grid, boolean[][] visited, int row, int col) {

        int n = grid.length;
        int m = grid[0].length;

        visited[row][col] = true;

        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m){
                if (!visited[nrow][ncol] && grid[nrow][ncol] == '1')
                    dfs(grid, visited, nrow, ncol);
            }
        }
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(numIslands(grid2));
    }
}

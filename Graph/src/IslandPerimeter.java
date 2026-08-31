public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        int[] arr = new int[1];
        for (int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    return dfs(grid, visited, i, j);
                }
            }
        }
        return -1;
    }


    private int dfs(int[][] grid, boolean[][] visited, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;

        if (row < 0 || row >= n || col < 0 || col >= m)
            return 1;

        if (grid[row][col] != 1)
            return 1;

        if (visited[row][col])
            return 0;

        visited[row][col] = true;

        return
                dfs(grid, visited, row - 1, col) +
                dfs(grid, visited, row, col + 1) +
                dfs(grid, visited, row + 1, col) +
                dfs(grid, visited, row, col - 1);

    }
//    private int dfs(int[][] grid, boolean[][] visited, int row, int col, int[] arr) {
//        int n = grid.length;
//        int m = grid[0].length;
//
//        int[] delrow = {-1, 0, 1, 0};
//        int[] delcol = {-1, 0, 1, 0};
//
//        visited[row][col] = true;
//        arr[0] += 4;
//        for (int i = 0; i < 4; i++) {
//            int nrow = row + delrow[i];
//            int ncol = col + delcol[i];
//
//            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
//                if(!visited[nrow][ncol] && grid[nrow][ncol] == 1) {
//                    arr[0] -= 1;
//                    dfs(grid, visited, nrow, ncol, arr);
//                }
//            }
//        }
//        return arr[0];
//    }
}

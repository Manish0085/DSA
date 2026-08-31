public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;

        boolean[][] visited = new boolean[n][m];
        int[][] ans = new int[n][m];
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = image[i][j];
            }
        }

        dfs(ans, visited, sr, sc, color, ans[sr][sc]);
        return ans;
    }

    private void dfs(int[][] ans, boolean[][] visited, int sr, int sc, int color, int original) {
        int n = ans.length;
        int m = ans[0].length;

        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        visited[sr][sc] = true;
        ans[sr][sc] = color;
        for(int i=0; i<4; i++) {
            int nrow = sr + delrow[i];
            int ncol = sc + delcol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m){
                if(!visited[nrow][ncol] && ans[nrow][ncol] == original) {
                    dfs(ans, visited, nrow, ncol, color, original);
                }
            }
        }
    }
}

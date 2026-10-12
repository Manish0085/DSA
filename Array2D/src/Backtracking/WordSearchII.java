package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        int n = board.length;
        int m = board[0].length;

        List<String> ans = new ArrayList<>();

        for(String  s: words) {
            boolean[][] visited = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (board[i][j] == s.charAt(0)) {
                        if(dfs(board, visited, s, i, j, 0)) {
                            ans.add(s);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public boolean dfs(char[][] board, boolean[][] visited, String word, int row, int col, int index) {
        int n = board.length;
        int m = board[0].length;
        visited[row][col] = true;


        if (index == word.length()-1)
            return true;
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];

            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m) {
                if (!visited[nrow][ncol] && board[nrow][ncol] == word.charAt(index + 1)) {
                    if (dfs(board, visited, word, nrow, ncol, index+1)) {
                        return true;
                    }
                }
            }
        }
        visited[row][col] = false;
        return false;
    }
}

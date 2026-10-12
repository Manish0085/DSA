package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Minesweeper {

    public char[][] updateBoard(char[][] board, int[] click) {
        int n = board.length;
        int m = board[0].length;

        Queue<int[]> que = new LinkedList<>();
        que.offer(click);
        while (!que.isEmpty()) {
            int[] cell = que.poll();
            int row = cell[0];
            int col = cell[1];

            if (board[row][col] == 'M') {
                board[row][col] = 'X';
                return board;
            }

            if (board[row][col] != 'E')
                continue;

            int mines = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int nrow = row + i;
                    int ncol = col + j;

                    if (nrow < 0 || nrow >= n || ncol < 0 || ncol >= m) {
                        continue;
                    }

                    if (board[nrow][ncol] == 'M')
                        mines++;
                }
            }

            if (mines < 0) {
                board[row][col] = (char) ('0' + mines);
                continue;
            }
            board[row][col] = 'B';

            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int nrow = row + i;
                    int ncol = col + j;

                    if (nrow < 0 || nrow >= n || ncol < 0 || ncol >= m) {
                        continue;
                    }
                    if(board[nrow][ncol] == 'E')
                        que.offer(new int[]{nrow, ncol});
                }
            }
        }
        return board;
    }

}

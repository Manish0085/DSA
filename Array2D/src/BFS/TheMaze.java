package BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Triplet1 {
    int row ;
    int col;
    String path;

    public Triplet1(int row, int col, String path) {
        this.row = row;
        this.col = col;
        this.path = path;
    }
}
public class TheMaze {

    public String ratInMaze(int[][] maze) {
        int n = maze.length;
        if (maze[0][0] == 0)
            return "";
        ArrayList<String> ans = new ArrayList<>();
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        Map<Integer, String> directions = Map.of(
                0, "U",
                1, "R",
                2, "D",
                3, "L"
        );
        boolean[][] visited = new boolean[n][n];
        Queue<Triplet1> que = new LinkedList<>();
        que.offer(new Triplet1(0, 0, ""));
        visited[0][0] = true;
        while (!que.isEmpty()) {
            Triplet1 triplet1 = que.poll();
            int row = triplet1.row;
            int col = triplet1.col;
            String path = triplet1.path;

            if (row == n-1 && col == n-1)
                return path;

            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                String dir = directions.get(i);

                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < n) {
                    if (!visited[nrow][ncol] && maze[nrow][ncol] == 1) {
                        que.offer(new Triplet1(nrow, ncol, path + dir));
                        visited[nrow][ncol] = true;
                    }
                }
            }
        }
        return "";
    }

}

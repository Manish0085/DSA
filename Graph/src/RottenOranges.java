import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair {
    int row;
    int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;}
}
public class RottenOranges
{

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] ans = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<Pair> que = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!visited[i][j] && grid[i][j] == 2) {
                    que.offer(new Pair(i, j));
                }
            }
        }

        

    }
}

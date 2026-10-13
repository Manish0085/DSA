import javax.print.DocFlavor;

public class ToeplitzMatrix {


    public boolean isToeplitzMatrix2(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] != matrix[i-1][j-1])
                    return false;

            }
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i=0; i<n; i++) {
            if(!dfs(matrix, i, 0))
                return false;
        }

        for (int j = 0; j < m; j++) {
            if(!dfs(matrix, 0, j))
                return false;
        }
        return true;
    }

    public boolean dfs(int[][] matrix, int row, int col) {
        int n = matrix.length;
        int m = matrix[0].length;

        int nrow = row + 1;
        int ncol = col + 1;

        if(nrow >= n || ncol >= m)
            return true;

        if (matrix[row][col] != matrix[nrow][ncol])
                return false;
        return dfs(matrix, nrow, ncol);
    }
}

package BinarySeach;

public class SearchRawAndColWiseIn2D {

    public boolean search(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int raw = 0, col = m-1;
        while (raw < n && col >= 0){
            if (matrix[raw][col] == target)
                return true;
            else if (matrix[raw][col] > target)
                col--;
            else
                raw++;

        }
        return false;
    }
}

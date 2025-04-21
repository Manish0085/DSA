package BinarySeach;

public class FindPeakIndexII {

    public int[] optimal(int[][] matrix){

        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = m-1;
        while (low <= high){
            int mid = (low + high)/2;
            int raw = findMaxInCol(matrix, n, m, mid);
            int left = (mid - 1 >= 0)? matrix[raw][mid-1]: -1;
            int right = (mid + 1 < m)? matrix[raw][mid+1]: -1;
            if (left < matrix[raw][mid] && right < matrix[raw][mid])
                return new int[]{raw, mid};
            else if (left > matrix[raw][mid])
                high = mid -1;
            else
                low = mid + 1;
        }
        return new int[]{-1, -1};
    }

    private int findMaxInCol(int[][] matrix,int n,int m,int col){
        int max = -1;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (max < matrix[i][col]){
                max = matrix[i][col];
                index = i;
            }
        }
        return index;
    }
}

package BinarySeach;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOf2DArray {

    public int brute(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get((m*n)/2);
    }
}

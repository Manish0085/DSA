package Questions;

import java.util.Stack;

public class TheCelebrityProblem {

    public static int celebrity1(int[][] matrix){

        int raw = matrix.length;
        int col = matrix[0].length;
        int index = -1;
        for (int i = 0; i < raw; i++) {
            boolean flag = false;
            for (int j = 0; j < col; j++) {
                if(i != j && matrix[i][j] == 1){
                    flag = true;
                }
            }
            if (!flag){
                index = i;
                break;
            }
        }
        System.out.println(index);
        if (index == -1){
            return -1;
        } else {
            boolean flag = false;
            for (int i = 0; i < matrix.length; i++) {

                if (matrix[i][index] == 0){
                    return -1;
                }
            }
        }
        return index;
    }


    public static int celebrity2(int[][] matrix){

        Stack<Integer> stack = new Stack<>();
        for (int i = matrix.length-1; i >= 0; i--) {
            stack.push(i);
        }
        while (stack.size() > 1){
            int first = stack.pop();
            int second = stack.pop();
            if(matrix[first][second] == 1 && matrix[second][first] == 0){
                stack.push(second);
            }

            else if(matrix[first][second] == 0 && matrix[second][first] == 1){
                stack.push(first);
            }
        }
        if (stack.isEmpty()){
            return -1;
        }

        int num = stack.pop();
        int raw = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            raw += matrix[num][col];
            col += matrix[i][num];
        }
        return (raw == 1 && col == matrix.length)? num: -1;
    }

    public static void main(String[] args) {
        celebrity1(new int[][]{{1, 1, 0}, {0, 1, 0}, {0, 1, 1}});
    }

    /*
        1 1 0
        0 1 0
        0 1 1
     */
}

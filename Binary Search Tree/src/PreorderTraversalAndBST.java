import java.util.Stack;

public class PreorderTraversalAndBST {

    public int canRepresentBST2(int arr[], int N){

        Stack<Integer> lower = new Stack<>();
        Stack<Integer> upper = new Stack<>();
        lower.push(Integer.MIN_VALUE);
        upper.push(Integer.MAX_VALUE);
        int left = 0;
        int right = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lower.peek())
                return 0;
            while (arr[i] > upper.peek()){
                upper.pop();
                lower.pop();
            }
            left = lower.pop();
            right = upper.pop();
            // right
            lower.push(arr[i]);
            upper.push(right);

            // left
            lower.push(left);
            upper.push(arr[i]);

        }
        return 1;
    }





    // Recursive Approach
    int index = 0;

    public int canRepresentBST1(int arr[], int N){
        isBST(arr, Integer.MIN_VALUE, Integer.MAX_VALUE, N);
        return index == N? 1: 0;
    }

    public void isBST(int[] arr, int lower, int upper, int N){

        if (index == N || arr[index] < lower || arr[upper] > upper)
            return;
        int value = arr[index++];
        isBST(arr, lower, value, N);
        isBST(arr, value, upper, N);
    }

}

public class PreorderTraversalAndBST {

    // Recursive Approach
    int index = 0;

    public int canRepresentBST(int arr[], int N){
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

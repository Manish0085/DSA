package Array;

public class LargestElement {


    //Brute force
    public int bruteFore(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;


        }

        return arr[n-1];
    }
    public int findLargest(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}

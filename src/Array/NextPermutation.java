package Array;

public class NextPermutation {

    public void nextPermutation(int[] arr){
        int idx = -1;
        int n = arr.length;
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }

        if (idx == -1){
            reverse(arr, 0, n-1);
            return;
        }

        for (int i = n-1; i > idx; i++) {
            if(arr[i] > arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }

        reverse(arr, idx+1, n-1);
    }

    public void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

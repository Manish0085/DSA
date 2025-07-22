public class RotateArray {

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % arr.length;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        for (int num: arr){
            System.out.print(num+" ");
        }
    }

    private static void reverse(int[] arr, int low, int high){
        while (low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public void rotateByOnePlace(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    public static void main(String[] args) {
        rotate(new int[]{-1,-100,3,99}, 2);
    }


}

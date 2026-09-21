package TwoPointer;

public class RemoveDup {

    public static int remove(int[] arr) {
        if(arr.length < 2)
            return arr.length;

        int i=0, j = 1;
        while (j < arr.length) {
            if(arr[i] != arr[j]) {
                arr[++i] = arr[j];
            }
            j++;
        }

        return i+1;
    }

    public static void main(String[] args) {
        System.out.println((remove(new int[]{1, 1, 1, 2, 2, 3, 3, 4, 4, 4})));
    }
}

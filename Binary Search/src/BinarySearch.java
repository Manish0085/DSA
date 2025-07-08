import java.util.Scanner;

public class BinarySearch {

    public static int searchForAscendinglySortedArray(int[] arr, int n, int key){
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                high = mid-1;
            else
                low = mid+1;
        }

        return -1;
    }


    public static int searchForDescendinglySortedArray(int[] arr, int n, int key){
        int low = 0;
        int high = n-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                high = mid-1;
            else
                low = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(searchForDescendinglySortedArray(arr, n, 6));
    }
}

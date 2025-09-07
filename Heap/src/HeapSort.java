import java.util.HashMap;

public class HeapSort {

    public void heapify(int[] arr, int index, int n){
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if (largest != index){
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            heapify(arr, largest, n);
        }
    }

    public void sortArray(int[] arr, int n){
        for (int i = n-1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    public void print(int[] arr, int n){
        if (n == 0){
            System.out.println("Heap Underflow");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println("end");
    }

    public void buildHeap(int[] arr, int n){
        for (int i = n/2 - 1; i >= 0 ; i--) {
            heapify(arr, i, n);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 9, 5, 13, 18, 14, 11, 70};
        HeapSort heapSort = new HeapSort();
        heapSort.buildHeap(arr, 10);
        heapSort.print(arr, 10);
        heapSort.sortArray(arr, 10);
        heapSort.print(arr, 10);
    }
}

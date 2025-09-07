public class BuildMaxHeap {

    public void buildMaxHeap(int[] arr, int n){
        for (int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }
    }

    void heapify(int[] arr, int index, int n){
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if (left < n && arr[largest] < arr[left]){
            largest = left;
        }
        if (right < n && arr[largest] < arr[right]){
            largest = right;
        }

        if (largest != index){
            int temp = arr[largest];
            arr[largest] = arr[index];
            arr[index] = temp;
            heapify(arr, largest, n);
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

    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 9, 5, 13, 18, 14, 11, 70};
        BuildMaxHeap maxHeap = new BuildMaxHeap();
        maxHeap.buildMaxHeap(arr, 10);
        maxHeap.print(arr, 10);
    }

}

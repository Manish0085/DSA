import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeTwoBiinaryHeaps {

    public int[] mergeHeaps1(int[] a, int[] b){
        PriorityQueue<Integer> priQue1 = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> priQue2 = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            priQue1.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            priQue2.add(b[i]);
        }

        while (!priQue2.isEmpty()){
            priQue1.add(priQue2.remove());
        }

        int[] ans = new int[priQue1.size()];
        int i=0;
        while (!priQue1.isEmpty()){
            ans[i] = priQue1.remove();
            i++;
        }

        return ans;
    }


    public int[] mergeHeap2(int[] a, int[] b){
        int[] ans = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = a[i];
        }
        int j = a.length;
        for (int i = 0; i < b.length; i++) {
            ans[j] = b[i];
            j++;
        }

        // convert the array into max heap

        int size = ans.length;
        for(int i = size/2; i>=0; i--){
            heapify(ans, i, size);
        }

        return ans;
    }

    public void heapify(int[] arr, int index, int n){
        int largest = index;
        int left = 2 * index + 1;
        int right = 2 * index + 2;

        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }

        if (left != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(arr, largest, n);
        }
    }


}

import java.util.PriorityQueue;

public class KthLargestElement {

    public int kthLargestElemnt(int[] arr, int k){
        PriorityQueue<Integer> priQue = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priQue.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if(priQue.peek() < arr[i]){
                priQue.remove();
                priQue.add(arr[i]);
            }
        }
        return priQue.peek();
    }
}

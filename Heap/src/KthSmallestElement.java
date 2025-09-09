import java.util.PriorityQueue;

public class KthSmallestElement {

    public int kthSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> priQue = new PriorityQueue<>((a, b) -> b-a);
        for (int i = 0; i < k; i++) {
            priQue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < priQue.peek()){
                priQue.remove();
                priQue.add(arr[i]);
            }
        }

        return priQue.peek();
    }
}

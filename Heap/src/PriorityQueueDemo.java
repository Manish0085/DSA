import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); // min heap
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(1);
        minHeap.add(18);
        minHeap.add(15);

        System.out.println(minHeap.peek());
        System.out.println(minHeap.remove());
        System.out.println(minHeap.peek());
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.remove()+" ");
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(1);
        maxHeap.add( 18);
        maxHeap.add(15);

        System.out.println(maxHeap.peek());
        System.out.println(maxHeap.remove());
        System.out.println(maxHeap.peek());
        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.remove()+" ");
        }
    }
}

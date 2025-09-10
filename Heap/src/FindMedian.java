import java.util.ArrayList;
import java.util.PriorityQueue;

public class FindMedian {



    public ArrayList<Double> getMedian(int[] arr){
        ArrayList<Double> list = new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b-a);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        for(int num: arr){
            maxHeap.offer(num);


            if(!minHeap.isEmpty() && minHeap.peek() < maxHeap.peek()){
                minHeap.offer(maxHeap.poll());
            }

            if (minHeap.size() + 1 < maxHeap.size()){
                minHeap.offer(maxHeap.poll());
            } else  {
                maxHeap.offer(maxHeap.poll());
            }

            if (maxHeap.size() == minHeap.size()){
                double median = (maxHeap.peek() + minHeap.peek())/2.0;
                list.add(median);
            }
            else {
                list.add((double)maxHeap.peek());
            }
        }
        return list;
    }


}

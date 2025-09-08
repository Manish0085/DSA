import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priQue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            priQue.add(stones[i]);
        }

        while (priQue.size() > 1){
            int destroy = priQue.remove() - priQue.remove();
            if(destroy > 0) {
                priQue.add(destroy);
            }

        }

        return priQue.isEmpty()? 0: priQue.peek();
    }
}

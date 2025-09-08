import java.util.PriorityQueue;

public class MinimumCaostOfRopews {

    public int minCost(int[] arr){
        PriorityQueue<Integer> priQue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            priQue.add(arr[i]);
        }

        int cost = 0;
        while (priQue.size() > 1){
            int sum = (priQue.remove() + priQue.remove());
            cost += sum;
            priQue.add(sum);
        }

        return cost;
    }
}

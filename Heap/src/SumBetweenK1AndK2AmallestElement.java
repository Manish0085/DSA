import java.util.Comparator;
import java.util.PriorityQueue;

public class SumBetweenK1AndK2AmallestElement {


    public int sum(int[] arr, int k1, int k2){
        PriorityQueue<Integer> priQue1 = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> priQue2 = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < k1; i++) {
            priQue1.add(arr[i]);
        }
        for (int i = 0; i < k2-1; i++) {
            priQue2.add(arr[i]);
        }

        for (int i = k1; i < arr.length; i++) {
            if (arr[i] < priQue1.peek()){
                priQue1.remove();
                priQue1.add(arr[i]);
            }
        }
        for (int i = k2-1; i < arr.length; i++) {
            if (arr[i] < priQue2.peek()){
                priQue2.remove();
                priQue2.add(arr[i]);
            }
        }

        int sum1 = priQue1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        int sum2 = priQue1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        return sum2 - sum1;
    }
}

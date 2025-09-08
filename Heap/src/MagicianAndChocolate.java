import java.util.Comparator;
import java.util.PriorityQueue;

public class MagicianAndChocolate {

    public int maximumChocolate(int[] arr, int time){
        PriorityQueue<Integer> priQue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            priQue.add(arr[i]);
        }

        int maxChocolate = 0;
        while (time > 0 && !priQue.isEmpty()){
            int chocolate = priQue.remove();
            maxChocolate += chocolate;
            if(chocolate / 2 > 0) {
                priQue.add(chocolate / 2);
            }
            time--;
        }
        return maxChocolate;
    }
}

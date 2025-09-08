import java.util.PriorityQueue;

public class MaxProfit {


    public int maxPro(int[] arr, int time){
        PriorityQueue<Integer> priQue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            priQue.add(arr[i]);
        }

        int ans = 0;
        while (time > 0 && !priQue.isEmpty()){
            int temp = priQue.remove();
            ans += time;
            priQue.add(--temp);
            time--;
        }
        return ans;
    }
}

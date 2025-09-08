import java.util.PriorityQueue;

public class PickGifts {


    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> priQue = new PriorityQueue<>();
        for (int i = 0; i < gifts.length; i++) {
            priQue.add(gifts[i]);
        }

        while (k > 0 && !priQue.isEmpty()){
            int gift = priQue.remove();
            priQue.add((int)Math.sqrt(gift));
            k--;
        }

        long ans = 0;
        while (!priQue.isEmpty()){
            ans += priQue.remove();
        }
        return ans;
    }
}

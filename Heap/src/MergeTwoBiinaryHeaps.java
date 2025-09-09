import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeTwoBiinaryHeaps {

    public int[] mergeHeaps(int[] a, int[] b){
        PriorityQueue<Integer> priQue1 = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> priQue2 = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < a.length; i++) {
            priQue1.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            priQue2.add(b[i]);
        }

        while (!priQue2.isEmpty()){
            priQue1.add(priQue2.remove());
        }

        int[] ans = new int[priQue1.size()];
        int i=0;
        while (!priQue1.isEmpty()){
            ans[i] = priQue1.remove();
            i++;
        }

        return ans;
    }
}

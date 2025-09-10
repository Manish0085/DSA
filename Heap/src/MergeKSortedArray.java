import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedArray {

    public ArrayList<Integer> mergeKArrays1(int[][] arr, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < K; j++) {
                pq.offer(arr[i][j]);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
    }


    public ArrayList<Integer> mergeKArrays2(int[][] arr, int K) {
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (int i = 0; i < K; i++) {
            pq.offer(new Element(arr[i][0], i, 0));
        }

        ArrayList<Integer> ans = new ArrayList<>();
        Element element = null;
        int i = 0;
        int j = 0;
        while (!pq.isEmpty()){
            element = pq.poll();
            i = element.raw;
            j = element.col;
            ans.add(element.val);
            if (j + 1 < K){
                pq.offer(new Element(arr[i][j+1], i, j+1));
            }

        }

        return ans;
    }
}

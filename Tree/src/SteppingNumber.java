import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SteppingNumber {

    public ArrayList<Integer> stepnum(int A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(A == 0)
            ans.add(0);

        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i < 9; i++) {
            que.offer(i);
        }

        while (!que.isEmpty()) {
            int num = que.poll();

            if (num >= A && num <= B)
                ans.add(num);

            int lastDigit = num % 10;

            if (lastDigit > 0) {
                int next = num * 10 + (lastDigit - 1);

                if(next <= B)
                    que.offer(next);
            }

            if (lastDigit < 9) {
                int next = num * 10 + (lastDigit + 1);

                if(next <= B)
                    que.offer(next);
            }
        }

        return ans;
    }
}

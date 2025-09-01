import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelOrderSum {

    public int maxLevelSum(Node root) {

        int maxSum = Integer.MIN_VALUE;
        int level = 0;
        int maxLevel = 0;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            int curSum = 0;
            for (int i = 0; i < size; i++) {
                Node temp = que.remove();
                curSum += temp.data;
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }

            if (curSum > maxSum){
                maxSum = curSum;
                maxLevel = level;
            }
            level++;
        }

        return maxLevel;
    }
}

import java.util.*;

class Triplet {
    TreeNode node;
    int vertical;
    int level;

    public Triplet(TreeNode node, int vertical, int level) {
        this.node = node;
        this.vertical = vertical;
        this.level = level;
    }
}
public class VerticalOrderTraversal {

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();

        Queue<Triplet> que = new LinkedList<>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        que.offer(new Triplet(root, 0, 0));
        while (!que.isEmpty()) {
            Triplet triplet = que.poll();
            TreeNode node = triplet.node;
            int vertical = triplet.vertical;
            int level = triplet.level;

            if(!map.containsValue(vertical))
                map.put(vertical, new TreeMap<>());

            if (!map.get(vertical).containsKey(level))
                map.get(vertical).put(level, new PriorityQueue<>());

            map.get(vertical).get(level).add(node.val);

            if (node.left != null)
                que.offer(new Triplet(node.left, vertical-1, level+1));
            if (node.right != null)
                que.offer(new Triplet(node.right, vertical+1, level+1));
        }


        List<List<Integer>> ans = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> tree: map.values()) {
            ans.add(new ArrayList<>());
            for (PriorityQueue<Integer> pq: tree.values()) {
                while (!pq.isEmpty()) {
                    ans.get(ans.size()-1).add(pq.poll());
                }
            }
        }

        return ans;
    }
}

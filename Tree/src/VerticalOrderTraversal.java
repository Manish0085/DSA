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

class Pair {
    TreeNode node;
    int vertical;


    public Pair(TreeNode node, int vertical) {
        this.node = node;
        this.vertical = vertical;
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

    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if(root == null)
            return ans;

        TreeMap<Integer, ArrayList> map = new TreeMap<>();
        Queue<Pair> que = new LinkedList<>();
        que.offer(new Pair(root, 0));
        while (!que.isEmpty()) {
            Pair p = que.poll();
            TreeNode node = p.node;
            int vertical = p.vertical;

            if(!map.containsKey(vertical))
                map.put(vertical, new ArrayList());
            map.get(vertical).add(node.val);
            if (node.left != null)
                que.offer(new Pair(node, vertical-1));

            if (node.right != null)
                que.offer(new Pair(node, vertical+1));
        }

        for (ArrayList<Integer> list: map.values())
            ans.add(list);

        return ans;
     }

    public ArrayList<Integer> verticalSum(TreeNode root) {
        if(root == null)
            return new ArrayList<>();

        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> que = new LinkedList<>();
        que.offer(new Pair(root, 0));
        while (!que.isEmpty()) {
            Pair pair = que.poll();
            TreeNode node = pair.node;
            int vertical = pair.vertical;

            map.put(vertical, map.getOrDefault(vertical, 0) + node.val);

            if(node.left != null)
                que.offer(new Pair(node.left, vertical-1));

            if(node.right != null)
                que.offer(new Pair(node.right, vertical+1));
        }

        return new ArrayList<>(map.values());
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class CloneTheGraph {

    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    public Node dfs(Node node, Map<Node, Node> map) {
        if(node == null)
            return null;

        if (map.containsKey(node))
            return map.get(node);

        Node cloneNode = new Node(node.val);
        map.put(node, cloneNode);
        for (Node neigh: node.neighbors) {
            cloneNode.neighbors.add(dfs(neigh, map));

        }

        return cloneNode;
    }

}

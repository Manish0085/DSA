import java.util.ArrayList;
import java.util.List;

public class GraphValidTree {
    public boolean isTree(int n, int m, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge: edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        if(!dfs(adj, visited, 0, -1)) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
               return false;
            }
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> adj, boolean[] visited, int node, int parent) {
        visited[node] = true;

        for (int neigh: adj.get(node)) {
            if (parent == neigh)
                continue;
            if (visited[neigh]) {
                return false;
            }

            if (!dfs(adj, visited, neigh, node)) {
                return false;
            }
        }

        return true;
    }
}

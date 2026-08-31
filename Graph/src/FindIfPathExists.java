import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindIfPathExists {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
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
        Queue<Integer> que = new LinkedList<>();
        que.offer(source);
        visited[source] = true;
        while (!que.isEmpty()) {
            int node = que.poll();
            if (node == destination)
                return true;
            for (int neigh: adj.get(node)) {
                if (!visited[neigh]) {
                    que.offer(neigh);
                    visited[neigh] = true;
                }
            }
        }
        return false;
    }

}

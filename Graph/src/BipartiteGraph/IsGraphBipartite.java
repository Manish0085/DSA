package BipartiteGraph;

import java.util.*;

public class IsGraphBipartite {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int u = 0; u < n; u++) {
            for(int v: graph[u]) {
                adj.get(u).add(v);
            }
        }


        int[] color = new int[n];
        Arrays.fill(color, -1);
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                queue.offer(i);
                color[i] = 0;

                while (!queue.isEmpty()) {
                    int node = queue.poll();

                    for (int neigh : adj.get(node)) {
                        if (color[neigh] == -1) {
                            color[neigh] = 1 - color[node];
                            queue.offer(neigh);
                        } else if (color[neigh] == color[node])
                            return false;
                    }
                }
            }
        }
        return true;
    }
}

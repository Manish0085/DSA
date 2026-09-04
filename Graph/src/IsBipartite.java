import java.util.*;

public class IsBipartite {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i=0; i<graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adj.get(i).add(graph[i][j]);
            }
        }

        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i=0; i<n; i++) {
            if (color[i] == -1) {
                if (!bfs(adj, color, i))
                    return false;
            }
        }
        return true;
    }

    private boolean bfs(List<List<Integer>> adj, int[] color, int node) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(node);
        color[node] = 0;
        while (!que.isEmpty()) {
            int num = que.poll();
            for (int neigh: adj.get(num)) {

                if (color[neigh] == -1){
                    color[neigh] = 1 - color[num];
                    que.offer(neigh);
                }

                else if(color[num] == color[neigh])
                    return false;

            }
        }
        return true;
    }

    public boolean isBipartite2(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adj.get(i).add(graph[i][j]);
            }
        }

        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                color[i] = 0;
                if (!dfs(adj, color, i))
                    return false;
            }
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> adj, int[] color, int node) {
        for (int neigh: adj.get(node)) {
            if (color[neigh] == -1) {
                color[neigh] = 1 - color[node];
                if (!dfs(adj, color, neigh)) {
                    return false;
                }
            } else if(color[neigh] == color[node])
                return false;
        }
        return true;
    }

}

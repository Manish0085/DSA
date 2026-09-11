package BipartiteGraph;

import java.util.*;

public class PossibleBipartition {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < dislikes.length; i++) {
            int u = dislikes[i][0];
            int v = dislikes[i][1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color = new int[n+1];
        Arrays.fill(color, -1);
        Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                que.offer(i);
                color[i] = 0;

                while (!que.isEmpty()) {
                    int node = que.poll();

                    for (int neigh: adj.get(node)) {
                        if(color[neigh] == -1) {
                            color[neigh] = 1 - color[node];
                            que.offer(neigh);
                        }
                        else if(color[neigh] == color[node])
                            return false;
                    }
                }
            }
        }
        return true;
    }

}

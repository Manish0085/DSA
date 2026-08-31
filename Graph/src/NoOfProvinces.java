import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<n; i++)
            adj.add(new ArrayList<>());

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if (isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }
        int ans = 0;

        boolean[] visited = new boolean[n];
        Queue<Integer> que = new LinkedList<>();
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                ans++;
                visited[i] = true;
                que.offer(i);

                while (!que.isEmpty()) {
                    int node = que.poll();
                    for (int neigh: adj.get(node)) {
                        if(!visited[neigh]) {
                            que.offer(neigh);
                            visited[neigh] = true;
                        }
                    }
                }
            }
        }
        return ans;
    }
}

import java.util.*;

class Pair {
    int node;
    int weight;

    public Pair(int weight, int node) {
        this.weight = weight;
        this.node = node;
    }
}
public class NetworkDelayTime {

    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge: times) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new Pair(w, v));
        }
        boolean[] visited = new boolean[n+1];
        int[] dist = new int[n+1];
        Arrays.fill(dist, (int)(1e9));
        Queue<Pair> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        pq.offer(new Pair(0, k));
        dist[k] = 0;
        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            int weight = pair.weight;
            int node = pair.node;

            if(visited[node])
                continue;
            visited[node] = true;
            for (Pair p: adj.get(node)) {
                int nextNode = p.node;
                int nextNodeWeight = p.weight;

                if (nextNodeWeight + weight < dist[nextNode]) {
                    dist[nextNode] = nextNodeWeight + weight;
                    pq.offer(new Pair(weight+nextNodeWeight, nextNode));
                }

            }
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i <= n; i++) {
            ans = Math.max(dist[i], ans);
        }
        return ans;
    }

}

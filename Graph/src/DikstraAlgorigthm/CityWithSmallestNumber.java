package DikstraAlgorigthm;

import java.util.*;

class Container {
    int node;
    int weight;

    public Container( int node, int weight) {
        this.weight = weight;
        this.node = node;
    }
}

class CityWithSmallestNumber {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        List<List<Container>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];

            adj.get(u).add(new Container(v, wt));
            adj.get(v).add(new Container(u, wt));
        }

        int distance = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            Queue<Container> que = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));
            que.offer(new Container(i, 0));
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[i] = 0;


            while (!que.isEmpty())  {
                Container container = que.poll();
                int node = container.node;
                int weight = container.weight;

                for (Container c: adj.get(node)) {
                    int nextNode = c.node;
                    int nextNodeWt = c.weight;

                    if (nextNodeWt + weight < dist[nextNode] && nextNodeWt + weight <= distanceThreshold) {
                        dist[nextNode] = weight + nextNodeWt;
                        que.offer(new Container(nextNode, weight+nextNodeWt));
                    }
                }
            }

            int count = 0;
            for(int dis: dist) {
                if (dis != Integer.MAX_VALUE)
                    count++;
            }

            if (count <= distance) {
                distance = count;
                ans = i;
            }
        }
        return ans;
    }
}

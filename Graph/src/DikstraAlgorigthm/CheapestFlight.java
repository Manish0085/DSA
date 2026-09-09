package DikstraAlgorigthm;

import java.util.*;

class Triplet {
    int node;
    int cost;
    int step;

    public Triplet(int node, int cost, int step) {
        this.node = node;
        this.cost = cost;
        this.step = step;
    }
}
public class CheapestFlight {

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge: flights) {
            int source = edge[0];
            int destination = edge[1];
            int cost = edge[2];

            adj.get(source).add(new Pair(destination, cost));
        }

        int[] costs = new int[n];
        Arrays.fill(costs, (int)(1e9));
        Queue<Triplet> que = new LinkedList<>();
        que.offer(new Triplet(src, 0, -1));
        costs[src] = 0;

        while (!que.isEmpty()) {
            Triplet triplet = que.poll();
            int node = triplet.node;
            int cost = triplet.cost;
            int steps = triplet.step;



            for (Pair pair: adj.get(node)) {
                int nextNode = pair.node;
                int nextCost = pair.weight;

                int newCost = nextCost + cost;
                if (newCost < costs[nextNode] && steps+1 <= k) {
                    costs[nextNode] = newCost;
                    que.offer(new Triplet(nextNode, newCost, steps+1));
                }
            }
        }

        return costs[dst] != (int)(1e9)? costs[dst]: -1;
    }

    public static void main(String[] args) {
        int[][] heights = {
                {0,1,100},
                {1,2,100},
                {2,0,100},
                {1,3,600},
                {2,3,200}
        };
        int ans = findCheapestPrice(4, heights, 0, 3, 1);
        System.out.println(ans);
    }
}

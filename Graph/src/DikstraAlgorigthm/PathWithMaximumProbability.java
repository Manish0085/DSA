package DikstraAlgorigthm;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class Box {
    double probability;
    int node;

    public Box(double probability, int node) {
        this.probability = probability;
        this.node = node;
    }
}
public class PathWithMaximumProbability {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Box>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];

            adj.get(u).add(new Box(prob, v));
            adj.get(v).add(new Box(prob, u));
        }
        double[] dst = new double[n];
        dst[start_node] = 1.0;
        Queue<Box> que = new PriorityQueue<>((a, b) -> Double.compare(b.probability, a.probability));
        que.offer(new Box(1.0, start_node));
        while (!que.isEmpty()) {
            Box box = que.poll();
            double prob = box.probability;
            int node = box.node;

            if (node == end_node)
                return prob;

            for (Box b: adj.get(node)) {
                int nextNode = b.node;
                double nextNodeProb = b.probability;

                if(nextNodeProb * prob > dst[nextNode]) {
                    dst[nextNode] = nextNodeProb * prob;
                    que.offer(new Box(dst[nextNode], nextNode));
                }
            }
        }
        if(dst[end_node] == 0.0)
            return 0;
        return dst[end_node];
    }
}

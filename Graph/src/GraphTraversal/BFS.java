package GraphTraversal;

import java.util.*;

public class BFS {

    public List<Integer> BFSGraph(int v, List<Integer>[] adjList){
        Queue<Integer> que = new LinkedList<>();
        List<Integer> visited = new ArrayList<>(Collections.nCopies(v, 0));
        que.add(0);
        visited.set(0, 1);
        List<Integer> ans = new ArrayList<>();
        while (!que.isEmpty()){
            int node = que.poll();
            ans.add(node);
            for (int i = 0; i < adjList[node].size(); i++) {
                if (visited.get(adjList[node].get(i)) != 1){
                    visited.set(adjList[node].get(i), 1);
                    que.add(adjList[node].get(i));
                }
            }
        }
        return ans;
    }


    public List<Integer> BFSGraph(List<List<Integer>> adjList){
        int v = adjList.size();
        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[v];
        Arrays.fill(visited, false);
        que.add(0);
        visited[0] = true;
        List<Integer> ans = new ArrayList<>();
        while (!que.isEmpty()){
            int node = que.poll();
            ans.add(node);
            for (int neighbour: adjList.get(node)) {
                if (!visited[neighbour]){
                    visited[neighbour] = true;
                    que.add(neighbour);
                }
            }
        }
        return ans;
    }
}

package GraphTraversal;

import java.util.*;

public class DFS {

    public void DFSGraph(int node, List<Integer>[] adjList, List<Integer> ans, List<Integer> visited){
        visited.set(node, 1);
        ans.add(node);
        for (int i = 0; i < adjList[node].size(); i++) {
            if (visited.get(adjList[node].get(i)) != 1)
                DFSGraph(adjList[node].get(i), adjList, ans, visited);
        }
    }

    public void DFSUsingStack(List<List<Integer>> adjList){
        int n = adjList.size();
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0] = true;
        while (!stack.isEmpty()){
            int node = stack.pop();
            ans.add(node);
            List<Integer> neighbours = adjList.get(node);
            for (int i = neighbours.size() - 1; i >= 0; i--) {
                int neighbour = neighbours.get(i);
                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    stack.push(neighbour);
                }
            }
        }
    }
}

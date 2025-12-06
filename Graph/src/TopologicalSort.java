import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {

    public void DFS(int node, List<Integer>[] adj, boolean[] visited, Stack<Integer> stack){
        visited[node] = true;
        for (int i = 0; i < adj[node].size(); i++) {
            if (!visited[adj[node].get(i)])
                DFS(adj[node].get(i), adj, visited, stack);
        }
        stack.push(node);
    }


    public List<Integer> topoSort(List<Integer>[] adj){
        int n = adj.length;
        boolean[] visited = new boolean[n];
        Stack<Integer> st = new Stack();
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                DFS(i, adj, visited, st);
        }
        return new ArrayList<>(st);
    }
}

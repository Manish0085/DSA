package GraphCycle;

import java.util.Deque;
import java.util.List;

public class DFSCycle {


    public boolean detectCycle(int node, int parent, List<Integer>[] adjList, boolean[] visited){

        visited[node] = true;
        for (int i = 0; i < adjList[node].size(); i++) {
            if (parent == adjList[node].get(i))
                continue;
            if (visited[adjList[node].get(i)])
                return true;
            if (detectCycle(adjList[node].get(i), node, adjList, visited))
                return true;
        }

        return false;
    }
}

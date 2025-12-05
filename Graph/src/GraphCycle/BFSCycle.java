package GraphCycle;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BFSCycle
{


    public boolean detectCycle(List<Integer>[] adjList, boolean[] visited){
        Queue<int[]> que = new LinkedList<>();
        visited[0] = true;
        que.add(new int[] {0, -1});

        while (!que.isEmpty()){
            int[] current = que.poll();
            int node = current[0];
            int parent = current[0];

            for (int i = 0; i < adjList[node].size(); i++) {
                if (parent == adjList[node].get(i))
                    continue;
                if (visited[adjList[node].get(i)])
                    return true;
                visited[adjList[node].get(i)] = true;
                que.add(new int[]{adjList[node].get(i), node});
            }
        }
        return false;
    }
}

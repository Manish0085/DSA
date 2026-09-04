import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduling {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edge: prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];

            adj.get(course).add(prerequisite);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if(!visited[i]) {
                if (!dfs(adj, visited, i, pathVis)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(List<List<Integer>> adj, boolean[] visited, int node, boolean[] pathVis) {
        visited[node] = true;
        pathVis[node] = true;
        for (int neigh: adj.get(node)) {
            if (pathVis[neigh])
                return false;
            if(!visited[neigh]) {
                if(!dfs(adj, visited, neigh, pathVis)) {
                    return false;
                }
            }
        }
        pathVis[node] = false;
        return true;
    }

    public boolean kahnAlgo(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDeg = new int[numCourses];
        for(int[] edge: prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];

            adj.get(course).add(prerequisite);
            inDeg[prerequisite]++;
        }

        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDeg[i] == 0) {
                que.offer(i);
            }
        }

        while (!que.isEmpty()) {
            int node = que.poll();
            for (int neigh: adj.get(node)) {
                inDeg[neigh]--;
                if(inDeg[neigh] == 0) {
                    que.offer(neigh);
                }
            }
        }

        for (int deg: inDeg) {
            if (deg != 0)
                return false;
        }
        return true;
    }
}

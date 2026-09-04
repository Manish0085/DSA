import java.util.*;

public class CourseScheduling2 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge: prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];

            adj.get(course).add(prerequisite);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if(!visited[i]) {
                if(!dfs(adj, visited, pathVis, i, st))
                    return new int[0];
            }
        }
        int[] ans = new int[st.size()];
        int idx = st.size()-1;
        while (!st.isEmpty()) {
            ans[idx--] = st.pop();
        }
        return ans;
    }

    private boolean dfs(List<List<Integer>> adj, boolean[] visited, boolean[] pathVis, int node, Stack<Integer> st) {
        visited[node] = true;
        pathVis[node] = true;
        for (int neigh: adj.get(node)) {
            if (pathVis[neigh])
                return false;
            if (!visited[neigh]) {
                if(!dfs(adj, visited, pathVis, neigh, st)){
                    return false;
                }
            }
        }
        pathVis[node] = false;
        st.add(node);
        return true;
    }

    public int[] kahnAlgo(int numCourses, int[][] prerequisites) {
        int m = prerequisites.length;
        int[] ans = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        int[] inDeg = new int[numCourses];
        for (int[] edge: prerequisites) {
            int course = edge[0];
            int prerequisite = edge[1];

            adj.get(course).add(prerequisite);
            inDeg[prerequisite]++;
        }

        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDeg[i] == 0) {
                que.offer(i);
            }

        }

        int idx = numCourses-1;
        while (!que.isEmpty()) {
            int node = que.poll();
            ans[idx--] = node;
            for(int neigh: adj.get(node)) {
                inDeg[neigh]--;
                if (inDeg[neigh] == 0) {
                    que.offer(neigh);
                }
            }
        }

        for (int i = 0; i < numCourses; i++) {
            if (inDeg[i] != 0)
                return new int[0];
        }
        return ans;
    }
}

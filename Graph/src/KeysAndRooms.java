import java.util.List;

public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[] visited = new boolean[n];
        dfs(rooms, visited, 0);

        for (boolean flag: visited) {
            if (!flag)
                return flag;
        }
        return true;

    }

    public void dfs(List<List<Integer>> rooms, boolean[] visited, int node) {
        visited[node] = true;
        for(int it: rooms.get(node)) {
            if (!visited[it]) {
                dfs(rooms, visited, it);
            }
        }
    }
}

public class FindTheTownJudge {

    // Question 997
    public int findJudge(int n, int[][] trust) {
        int[] inDeg = new int[n+1];
        int[] outDeg = new int[n+1];

        for (int[] edge: trust){
            int u = edge[0];
            int v = edge[1];

            inDeg[v]++;
            outDeg[u]++;
        }

        for (int i=0; i<n; i++) {
            if (outDeg[i] == 0 && inDeg[i] == n-1)
                return i;
        }
        return -1;
    }

}

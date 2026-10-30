import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int idx = 0;
        int left = 0;
        int right = 0;

        while (left < s.length && right < g.length) {
            if (g[right] <= s[left]) {
                right++;
            }
            left++;
        }
        return right;
    }
}

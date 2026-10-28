import java.util.List;
import java.util.Map;

public class MakeValidAnagram {

    public int minSteps(String s, String t) {
        int[] frequency = new int[26];

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for (int num: frequency) {
            ans += Math.abs(num);
        }
        return ans/2;
    }

    public int minSteps1(String s, String t) {
        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            frequency1[s.charAt(i) - 'a']++;
            frequency2[t.charAt(i) - 'a']++;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                ans += frequency1[i];
                ans += frequency2[i];
            }

        }
        return ans/2;
    }
}

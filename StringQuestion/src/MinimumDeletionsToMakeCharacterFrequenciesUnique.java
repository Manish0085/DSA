import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {

    public int minDeletions(String s) {
        int[] freq = new int[26];
        for (char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }

        Arrays.sort(freq);

        for (int i = 0; i < freq.length / 2; i++) {
            int temp = freq[i];
            freq[i] = freq[freq.length - 1 - i];
            freq[freq.length - 1 - i] = temp;
        }

        Set<Integer> set = new HashSet<>();
        int count = 0;
        for (int i=0; i<26; i++) {
            while (freq[i] > 0 && set.contains(freq[i])) {
                freq[i]--;
                count++;
            }


            if (freq[i] > 0)
                set.add(freq[i]);
        }
        return count;
    }
}

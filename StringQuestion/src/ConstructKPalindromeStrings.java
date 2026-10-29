public class ConstructKPalindromeStrings {


    public boolean canConstruct(String s, int k) {
        if (s.length() < k) return false;

        int[] freq = new int[26];
        for (char ch: s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int nOfOdd = 0;
        for (int num: freq) {
            if (num % 2 == 1) nOfOdd++;
        }

        return nOfOdd <= k;
    }

}

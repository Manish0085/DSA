public class FindDifference
{
    public char findTheDifference(String s, String t) {
        int[] chars = new int[26];
        for (int i=0; i<Math.max(s.length(), t.length()); i++) {
            if (i < s.length()) chars[s.charAt(i) - 'a']++;
            if (i < t.length()) chars[t.charAt(i) - 'a']--;
        }

        for (int i=0; i<26; i++) {
            if (chars[i] != 0)
                return (char) (i + 'a');
        }
        return 'a';
    }
}

import java.util.Map;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] chars = new int[26];
        for (char ch: magazine.toCharArray()) {
            chars[ch-'a']++;
        }
        for (char ch: ransomNote.toCharArray()) {
            chars[ch-'a']--;
        }
        for (int num: chars) {
            if (num < 0)
                return false;
        }
        return true;
    }

}

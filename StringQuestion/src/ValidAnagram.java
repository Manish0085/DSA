import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }

        for(int num: frequency) {
            if (num != 0)
                return false;
        }
        return true;
    }
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
                if (map.get(t.charAt(i)) == 0)
                    map.remove(t.charAt(i));
            }
        }
        return map.isEmpty();
    }

    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);


        for (int i = 0; i < s.length(); i++) {
            if (charArray1[i] != charArray2[i])
                return false;
        }
        return true;
    }
}

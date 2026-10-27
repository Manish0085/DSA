import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length)
            return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            String str = strs[i];
            char ch = pattern.charAt(i);

            if ((map1.containsKey(ch) && !map1.get(ch).equals(str)) || (map2.containsKey(str) && map2.get(str) != ch))
                return false;
            map1.put(ch, str);
            map2.put(str, ch);

        }
        return true;
    }
}

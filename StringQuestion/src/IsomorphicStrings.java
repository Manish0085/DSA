import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int[] arr1 = new int[257];
        int[] arr2 = new int[257];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            int idx1 = ch1 + 1;
            int idx2 = ch2 + 1;

            if ((arr1[idx1] != 0 && arr1[idx1] != ch2) || (arr2[idx2] != 0 && arr2[idx2] != ch1))
                return false;
            else {
                arr1[idx1] = ch2;
                arr2[idx2] = ch1;
            }
        }
        return true;
    }
    public boolean isIsomorphic1(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> sToT = new HashMap<>();
        Map<Character, Character> tToS = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if ((sToT.containsKey(ch1) && sToT.get(ch1) != ch2) || (tToS.containsKey(ch2) && tToS.get(ch2) != ch1))
                return false;
            else {
                sToT.put(ch1, ch2);
                tToS.put(ch2, ch1);
            }

        }
        return true;
    }

}

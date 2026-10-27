import java.util.ArrayList;
import java.util.List;

public class FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (isMatched(words[i], pattern))
                list.add(words[i]);
        }
        return list;
    }

    public boolean isMatched(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] arr1 = new int[27];
        int[] arr2 = new int[27];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            int idx1 = ch1 - 'a' + 1;
            int idx2 = ch2 - 'a' + 1;

            if ((arr1[idx1] != 0 && arr1[idx1] != ch2) || (arr2[idx2] != 0 && arr2[idx2] != ch1))
                return false;

            arr1[idx1] = ch2;
            arr2[idx2] = ch1;
        }
        return true;
    }
}

import java.awt.*;

public class SortVowels {


    // T.C:- O(n)
    // S.C:- O(n)
    public static String sortVowels(String s){
        int[] lower = new int[26];
        int[] upper = new int[26];
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
            s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                lower[s.charAt(i) - 'a']++;
                sb.replace(i, i+1, "#");
            } else if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' ||
                    s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                upper[s.charAt(i) - 'A']++;
                sb.replace(i, i+1, "#");
            }
        }
        System.out.println(sb);

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);   // for Upper case letters
            while (upper[i] > 0){
                temp.append(ch);
                upper[i]--;
            }
        }

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);   // for Upper case letters
            while (lower[i] > 0){
                temp.append(ch);
                lower[i]--;
            }
        }

        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) == '#'){
                sb.replace(i, i+1, String.valueOf(temp.charAt(idx)));
                idx++;
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        sortVowels("lEetcOde");
    }
}

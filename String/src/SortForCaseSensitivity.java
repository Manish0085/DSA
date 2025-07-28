import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortForCaseSensitivity {


    public String sort1(String s){

        int[] lower = new int[26];
        int[] upper = new int[26];
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97){
                lower[s.charAt(i) - 'a']++;
                ans.replace(i, i+1, "#");
            }
             else{
                 upper[s.charAt(i) - 'A']++;
                ans.replace(i, i+1, "*");
            }
        }


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            while (upper[i] > 0){
                sb.append(ch);
                upper[i]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            while (lower[i] > 0){
                sb.append(ch);
                lower[i]--;
            }
        }

        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ans.charAt(i) == '#') {
                ans.replace(i, i + 1, String.valueOf(sb.charAt(idx)));
                idx++;
            }

        }

        for (int i = 0; i < s.length(); i++) {
            if (ans.charAt(i) == '*') {
                ans.replace(i, i + 1, String.valueOf(sb.charAt(i)));
                idx++;
            }
        }

        return ans.toString();
    }


    public static String sort2(String s){
        List<Character> lower = new ArrayList<>();
        List<Character> upper = new ArrayList<>();

        for (char ch: s.toCharArray()){
            if (ch >= 'a'){
                lower.add(ch);
            } else {
                upper.add(ch);
            }
        }

        Collections.sort(lower);
        Collections.sort(upper);

        StringBuilder ans = new StringBuilder();
        int li = 0;
        int ui = 0;
        for (char ch : s.toCharArray()){
            if (ch >= 'a'){
                ans.append(lower.get(li++));
            } else {
                ans.append(upper.get(ui++));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(sort2("XWMSPQ"));
    }
}

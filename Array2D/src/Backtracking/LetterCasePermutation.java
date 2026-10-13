package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        dfs(s, 0, "", ans);
        return ans;
    }

    public void dfs(String s, int idx, String output, List<String> ans) {
        if (idx == s.length()) {
            ans.add(output);
            return;
        }

        char ch = s.charAt(idx);
        if(Character.isDigit(s.charAt(idx))) {
            dfs(s, idx+1, output + ch, ans);
        } else {
            dfs(s, idx+1, output + Character.toLowerCase(ch), ans);


            dfs(s, idx+1, output + Character.toUpperCase(ch), ans);
        }
    }


}

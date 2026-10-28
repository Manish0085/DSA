import java.util.*;

public class GroupAnagrams {


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            int[] freq = new int[26];

            for (char ch: str.toCharArray()) {
                freq[ch-'a']++;
            }

            String key = Arrays.toString(freq);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }

    public List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Set<String> st = new HashSet<>();
        for(int i=0; i<strs.length; i++) {
            if(!st.contains(strs[i])){
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                st.add(strs[i]);
                for(int j=i+1; j<strs.length; j++) {
                    if(isAnagram(strs[i], strs[j])) {
                        list.add(strs[j]);
                        st.add(strs[j]);
                    }
                }
                ans.add(new ArrayList<>(list));
            }

        }
        return ans;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        if (s.equals(t))
            return true;
        int[] freq = new int[26];
        for(int i=0; i<s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int num: freq) {
            if(num != 0)
                return false;
        }
        return true;
    }
}

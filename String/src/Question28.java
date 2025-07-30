import java.util.Arrays;

public class Question28 {

    public int findIndex1(String haystack, String needle){
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n-m; i++) {
            int first  = i;
            int second = 0;
            while (second < m){
                if (haystack.charAt(first) == needle.charAt(second)){
                    first++;
                    second++;
                } else {
                      break;
                }
                if (second == m)
                    return first-second;
            }
        }
        return -1;
    }

    public int findIndex2(String haystack, String needle){
        int[] lps = new int[needle.length()];
        Arrays.fill(lps, 0);
        findLPS(lps, needle);
        int first = 0;
        int second = 0;
        while (first < haystack.length() && second < needle.length()){
            if (haystack.charAt(first) == needle.charAt(second)){
                first++;
                second++;
            } else {
                if (second == 0){
                    first++;
                } else {
                    second = lps[second-1];
                }
            }
        }
        if (second == needle.length())
            return first-second;
        return -1;
    }


    private void findLPS(int[] lps, String s){
        int pre = 0;
        int suf = 1;
        while(suf < s.length()){
            if(s.charAt(pre) == s.charAt(suf)){
                lps[suf] = lps[pre] + 1;
                pre++;
                suf++;
            }
            else {
                if (pre == 0){
                    lps[suf] = 0;
                    suf++;
                } else {
                    pre = lps[pre - 1];
                }
            }
        }
    }
}

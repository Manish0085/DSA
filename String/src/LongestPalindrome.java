public class LongestPalindrome {

    // T.C:- O(n)
    // S.C:- O(1)
    public int longestPalindrome(String s){
        int[] lower = new int[26];
        int[] upper = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a'){
                lower[s.charAt(i)-'a']++;
            } else {
                upper[s.charAt(i)-'A']++;
            }
        }
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            if (lower[i]%2 == 0)
                count += lower[i];
            else {
                count += lower[i] - 1;
                flag = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (upper[i]%2 == 0)
                count += upper[i];
            else {
                count += upper[i] - 1;
                flag = true;
            }
        }
        if (flag){
            return count+1;
        }
        return count;
    }
}

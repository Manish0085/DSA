import java.util.Arrays;

public class MakeStringPalindrome {


    public static int minChat(String s){
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        int n = s.length();
        s += "$";
        s += rev;
        System.out.println(s);

        // Longest Pre and Suf
        int[] lps = new int[n];
        Arrays.fill(lps, 0);
        int pre = 0;
        int suf = 1;
        while (suf < n){
            if (s.charAt(pre) == s.charAt(suf)){
                lps[suf] = pre+1;
                pre++;
                suf++;
            }
            else {
                if (pre == 0){

                    suf++;
                }
                else {
                    pre = lps[pre -1];
                }
            }
        }
        return n - lps[n-1];
    }

    public static void main(String[] args) {
        minChat("ROORSP");
    }
}

import java.util.Arrays;

public class LongestPrefixSuffix {


    public static int longestPreSuf1(String s){
        String[] pre = new String[s.length()-1];
        String[] suf = new String[s.length()-1];

        for (int i = 0; i < s.length()-1; i++) {
            pre[i] = s.substring(0, i+1);
        }

        for (int i = 1; i < s.length(); i++) {
            suf[i-1] = s.substring(i);
        }

        int length = 0;
        for (int i = 0; i < pre.length; i++) {
            for (int j = 0; j < suf.length; j++) {
                if (pre[i].equals(suf[j]))
                    length = Math.max(length, pre[i].length());
            }
        }
        System.out.println(length);
        return length  ;
    }

    public static void main(String[] args) {
        longestPreSuf1("ABCDEABCD");
    }



    public int longestPreSuf2(String s){
        int[] lps = new int[s.length()];
        int pre = 0;
        int suf = 1;
        Arrays.fill(lps, 0);
        while (suf < s.length()){
            if (s.charAt(pre) == s.charAt(suf)){
                lps[suf] = pre+1;
                pre++;
                suf++;
            }
            else {
                if (pre == 0){
                    lps[suf] = 0;
                    suf++;
                } else{
                    pre = lps[pre-1];
                }
            }
        }
        return lps[lps.length-1 ];
    }
}

import java.util.Arrays;

public class RepeatedStringMatching {


    public static int repeatedStringMatch(String a, String b) {
        if  (a.equals(b))
            return 1;
        int repeat = 1;
        String temp = a;
        while (temp.length() < b.length()) {
            temp = temp + a;
            repeat++;
        }

        if (KMP_MATCH(temp, b))
            return repeat;
        if (KMP_MATCH(temp+a, b))
            return repeat + 1;


        return -1;
    }

    public static void findLPS(int[] lps, String s){
        int pre = 0;
        int suf = 1;
        while (suf < s.length()){
            if (s.charAt(pre) == s.charAt(suf)){
                lps[suf] = pre + 1;
                pre++;
                suf++;
            } else {
                if (pre == 0){
                    suf++;
                } else {
                    pre = lps[pre - 1];
                }
            }
        }

    }
    public static boolean KMP_MATCH(String a, String b){
        int[] lps = new int[b.length()];
        Arrays.fill(lps, 0);
        findLPS(lps, b);
        int first = 0;
        int second = 0;
        while (first < a.length() && second < b.length()){
            if (a.charAt(first) == b.charAt(second)){
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
        if (second == b.length()){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int i = repeatedStringMatch("abc", "cdabcdab");
        System.out.println(i);
    }
}

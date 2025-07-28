public class SortString {


    public static String sort(String s){
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            while (count[i] > 0){
                sb.append(ch);
                count[i]--;
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

    public static void main(String[] args) {
        sort("edcab");
    }
}

import java.text.BreakIterator;

public class ReverseStringIII {

//    public String reverseWords(String s) {
//        char[] chars = s.toCharArray();
//
//        int left = 0;
//        int right = 0;
//        while (right < chars.length) {
//            while (right < chars.length && !Character.isWhitespace(chars[right])) {
//                right++;
//            }
//
//            int idx = right--;
//            while (left < right) {
//                char temp = chars[left];
//                chars[left] = chars[right];
//                chars[right] = temp;
//                left++;
//                right--;
//            }
//
//            left = right;
//            while (left < s.length() && Character.is(chars[left]))
//                left++;
//        }
//    }
//
//    public String reverseWords1(String s) {
//        String[] strs = s.split(" ");
//        int idx = 0;
//        for (String str: strs) {
//            String reversedString = reverse(str);
//            strs[idx++] = reversedString;
//        }
//        return String.join(" ", strs);
//    }

    public String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

}

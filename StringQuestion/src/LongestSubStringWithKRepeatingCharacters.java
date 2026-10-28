//public class LongestSubStringWithKRepeatingCharacters {
//
//    public int longestSubstring(String s, int k) {
//
//        int slow = 0;
//        int fast = 0;
//
//        int ans = 0;
//        while (fast < s.length()) {
//            if(s.charAt(slow) == s.charAt(fast)) {
//                fast++;
//                k++;
//            }
//        }
//
//        return ans;
//    }
//
//}

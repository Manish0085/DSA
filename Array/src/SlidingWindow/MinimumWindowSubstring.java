package SlidingWindow;

import java.util.HashMap;
import java.util.Map;


public class MinimumWindowSubstring {

    static String minWindow(String s1, String s2) {


        String result = "";
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        int total = 0;
        for (char ch : s2.toCharArray()){
            total++;
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int length = Integer.MAX_VALUE;
        int index = -1;
        while (end < s1.length()){
            map.put(s1.charAt(end), map.getOrDefault(s1.charAt(end), 0)-1);
            if (map.get(s1.charAt(end)) >= 0){
                total--;
            }
            while (total != 0 && start <= end){
                if (length > end - start  + 1) {
                    length = end-start+1;

                }
            }
            String sub = s1.substring(start, end+1);
        }

        return result;
    }

//    public static boolean containsAllChars(String sub, String s){
//        int[] subFreq = new int[128];
//        int[] sFreq = new int[128];
//
//        for (char ch: sub.toCharArray()) subFreq[ch]++;
//        for (char ch: s.toCharArray()) sFreq[ch]++;
//
//
//        for (int i = 0; i < 128; i++) {
//            if (sFreq[i] > subFreq[i])
//                return false;
//        }
//        return true;
//    }

}

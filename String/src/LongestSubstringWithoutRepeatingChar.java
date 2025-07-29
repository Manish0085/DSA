import java.util.ArrayList;
import java.util.Arrays;

public class LongestSubstringWithoutRepeatingChar {


    // T.C:- O(n)
    // S.C:- O(1)
    public int findLongestSubstring(String s){
        int length = 0;
        boolean[] count = new boolean[256];
        Arrays.fill(count, false);
        int first = 0;
        int second = 0;
        while (second <= s.length()){
            while (count[s.charAt(second)]){   // to remove repeating character
                count[first] = false;
                first++;
            }
            count[s.charAt(second)] = true;
            length = Math.max(length, second-first+1);
            second++;
        }
        return length;
    }
}

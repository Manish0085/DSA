import java.util.Arrays;

public class SmallestDistinctWindow {

    public int findSubString(String s) {
        int[] count = new int[256];
        Arrays.fill(count, 0);
        int diff = 0;
        for (int i = 0; i < count.length; i++) {
            if(count[s.charAt(i)] == 0){
                diff++;
            }
            count[s.charAt(i)]++;
        }

        Arrays.fill(count, 0);
        int first = 0;
        int second = 0;
        int length = s.length();
        while (second < s.length()){
            while (diff != 0 && second < s.length()){
                if (count[s.charAt(second)] == 0){
                    diff--;
                }
                count[s.charAt(second)]++;
                second++;
            }
            length = Math.min(length, second-first);

            while (diff != 1){
                length = Math.min(length, second-first);
                count[s.charAt(first)]--;
                if (count[s.charAt(first)] == 0){
                    diff++;
                }
                first++;
            }
        }

        return length;
    }
}

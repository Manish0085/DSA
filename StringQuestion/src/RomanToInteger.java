import java.util.Map;

public class RomanToInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int ans = 0;
        int i =0;
        for (i = 0; i < s.length()-1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                ans += (map.get(s.charAt(i+1)) - map.get(s.charAt(i)));
                i++;
            }
            else
                ans += map.get(s.charAt(i));
        }

        if(i == s.length()-1)
            ans += (map.get(s.charAt(i)));
        return ans;
    }

    public int romanToInt1(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int ans = 0;
        int i =0;
        for (i = 0; i < s.length()-1; i++) {
            if(s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                ans += (map.get('V') - map.get('I'));
                i++;
            } else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                ans += (map.get('X') - map.get('I'));
                i++;
            }
            else if(s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                ans += (map.get('L') - map.get('X'));
                i++;
            } else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                ans += (map.get('C') - map.get('X'));
                i++;
            }
            else if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                ans += (map.get('D') - map.get('C'));
                i++;
            } else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                ans += (map.get('M') - map.get('C'));
                i++;
            } else
                ans += map.get(s.charAt(i));
        }

        if(i == s.length()-1)
            ans += (map.get(s.charAt(i)));
        return ans;
    }
}

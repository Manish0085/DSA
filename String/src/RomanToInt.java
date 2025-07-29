import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int convert(String roman){
        int sum = 0;
        int idx = 0;
        while (idx < roman.length()-1){
            if (convertChar(roman.charAt(idx)) < convertChar(roman.charAt(idx + 1))) {
                    sum -= convertChar(roman.charAt(idx));
            }
            else {
                sum += convertChar(roman.charAt(idx));
            }
            idx++;
        }

        sum += convertChar(roman.charAt(roman.length()-1));
        return sum;
    }



    private int convertChar(char ch){
        if (ch == 'I')
            return 1;
        else if (ch == 'V')
            return 5;
        else if (ch == 'X')
            return 10;
        else if (ch == 'L')
            return 50;
        else if (ch == 'C')
            return 100;
        else if (ch == 'D')
            return 500;
        else if (ch == 'M')
            return 1000;
        return 0;

    }

    public static int convert2(String roman){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        int idx = 0;
        while (idx < roman.length()-1){
            if (map.get(roman.charAt(idx)) < map.get(roman.charAt(idx + 1))) {
                sum -= map.get(roman.charAt(idx));
            }
            else {
                sum += map.get(roman.charAt(idx));
            }
            idx++;
        }

        sum += map.get(roman.charAt(roman.length() - 1));
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(convert2("MCCXLVIII"));
    }

}

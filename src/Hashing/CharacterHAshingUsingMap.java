package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterHAshingUsingMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String str = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            int freq = 0;
            if (map.containsKey(key)) freq = map.get(key);
            freq++;
            map.put(key, freq);
        }

        System.out.print("Enter the no.");
        int q = sc.nextInt();
        while (q-- != 0){
            char ch = sc.next().charAt(0);
            System.out.println(ch +" --> "+map.getOrDefault(ch, 0));
        }
    }
}

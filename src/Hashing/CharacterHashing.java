package Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CharacterHashing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string ");
        String str = sc.nextLine();
        int[] hash = new int[26];
        Arrays.fill(hash, 0);
        for (int i = 0; i < str.length(); i++) {
            hash[str.charAt(i) - 'a']++;
        }


        System.out.println("Enter the no. that how many no. you are to check");
        int q = sc.nextInt();
        while (q-- != 0){
            char c = sc.next().charAt(0);
            System.out.print(c+" --> "+hash[c-'a']);
        }

        
    }
}

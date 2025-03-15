package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyUsingMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements in the array ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (map.containsKey(key)) freq = map.get(key);
            freq++;
            map.put(key, freq);
        }

        int q = sc.nextInt();
        while (q-- != 0){
            int num = sc.nextInt();
            System.out.println(num + " --> " + map.getOrDefault(num, 0));
        }
    }
}

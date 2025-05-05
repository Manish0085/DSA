package BitManipulation;

import java.util.HashMap;
import java.util.Map;

public class FindThatAppearsOne {

    public static int find1(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(arr[i]) == 1)
                return arr[i];
        }
        return 0;
    }

    public static int find2(int[] arr){
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
}

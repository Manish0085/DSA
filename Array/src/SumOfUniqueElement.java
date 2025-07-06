import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElement {

    public int sumOfUnique1(int[] arr){
        Map<Integer, Integer>  map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            if(map.get(arr[i]) == 1)
                sum += arr[i];
        }

        return sum;
    }


}

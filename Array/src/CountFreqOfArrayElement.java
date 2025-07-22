import java.beans.Introspector;
import java.util.Arrays;
import java.util.List;

public class CountFreqOfArrayElement {


    public List<Integer> countFreq1(int[] arr){
        Integer[] freq = new Integer[arr.length];
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i)
                    count++;
            }
            arr[i-1] = count;
        }
        return Arrays.asList(freq);
    }


    public List<Integer> countFreq2(int[] arr){
        Integer[] freq = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1 && arr[i] <= arr.length)
                freq[arr[i] - 1]++;
        }
        return Arrays.asList(freq);
    }
}

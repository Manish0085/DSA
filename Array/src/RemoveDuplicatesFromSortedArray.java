import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {


    public int removeDuplicate1(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for (int num: arr){
            set.add(num);
        }
        int i=0;
        for (Integer num: set){
            arr[i++] = num;
        }
        return i;
    }


    public int removeDuplicate2(int[] arr){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]){
                arr[j+1] = arr[i];
                j++;
            }
        }
        return j+1;
    }

}

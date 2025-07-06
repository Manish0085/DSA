import java.util.ArrayList;
import java.util.List;

public class SegregatePosAndNeg {

    public void segregateElements1(int[] arr) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                list1.add(arr[i]);
            else
                list2.add(arr[i]);
        }

        for (int i = 0; i < list1.size(); i++) {
            arr[i] = list1.get(i);
        }

        int j = list1.size();
        for (int i = 0; i < list2.size(); i++) {
            arr[j] = list2.get(i);
            j++;
        }
    }
}

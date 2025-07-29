import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factorial {

    public ArrayList<Integer> fact(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        while (n > 1){
            int carry = 0, res = 0, size = list.size();
            for (int i = 0; i < size; i++) {
                res = list.get(i) * n + carry;
                carry = res / 10;
                list.set(i, res % 10);
            }
            while (carry > 0){
                list.add(carry % 10);
                carry /= 10;
            }
            n--;
        }


        Collections.reverse(list);
        return list;
    }
}

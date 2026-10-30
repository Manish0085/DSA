import java.util.ArrayList;
import java.util.Arrays;

public class LemonadeChange {

    public boolean lemonadeChange(int[] bills) {

        int money5 = 0;
        int money10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5)
                money5++;
            else if (bills[i] == 10) {
                if (money5 > 0) {
                    money5--;
                } else {
                    return false;
                }
                money10++;
            }
            else {
                if (money5 - 1 >= 0 && money10 - 1 >= 0) {
                    money5 -= 1;
                    money10 -= 1;
                } else if (money5 - 3 >= 0) {
                    money5 -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

package BasicMaths;

public class EvenlyDivides {

    public int count(int num){
        int count = 0;
        int n = num;
        while(n > 0){
            int rem = n % 10;
            if (rem != 0 && num % rem == 0){
                count++;
            }
            n /= 10;
        }
        return count;
    }
}

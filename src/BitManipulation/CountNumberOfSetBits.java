package BitManipulation;

public class CountNumberOfSetBits
{

    public static int count(int n){
        int count = 0;
        while (n > 0){
            if(n % 2 == 1)
                count++;
            n /= 2;
        }
        return count;
    }

    public static int count1(int n){
        int count = 0;
        while (n > 0){
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }

    public static int count2(int n){
        int count = 0;
        while (n > 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}

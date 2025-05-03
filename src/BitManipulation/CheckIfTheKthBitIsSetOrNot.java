package BitManipulation;

public class CheckIfTheKthBitIsSetOrNot {

    public static boolean brute(int n, int k){

        StringBuilder str = new StringBuilder();
        while (n > 0){
            str.append(n % 2);
            n /= 2;
        }
        if (k >= str.length())
            return false;
        return str.charAt(k) == '1';
    }

    public static boolean optimal(int n, int k){
        return (n & (1 << k)) != 0;
    }

    public static boolean optimal2(int n, int k){
        return (1 & (n >> k)) == 1;
    }
}

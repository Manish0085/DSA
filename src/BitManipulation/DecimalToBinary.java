package BitManipulation;

public class DecimalToBinary {

    public static String decToBin(int n){
        String result = "";
        while (n > 0){
            if (n % 2 == 1)
                result += "1";
            else
                result += "0";
            n /= 2;
        }
        return new StringBuilder(result).reverse().toString();
    }
}

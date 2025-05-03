package BitManipulation;

public class BinaryToDecimal {

    public static int binToDec(String binary){
        int decimal = 0;
        for (int i = binary.length()-1; i >= 0; i--) {
            if (binary.charAt(i) == '1'){
                decimal += (int) Math.pow(2, binary.length()-i-1);
            }
        }
        return decimal;
    }
}

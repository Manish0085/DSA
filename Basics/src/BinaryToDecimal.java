public class BinaryToDecimal {


    public void convert(String b){
        int dec = 0;
        for (int i = b.length()-1; i >= 0; i--) {
            if (b.charAt(i) == '1'){
                dec += Math.pow(2, b.length()-i-1);
            }
        }
        System.out.println(dec);
    }

    public void convertToDec(int binary){
        int dec = 0;
        int mul = 1;
        while(binary > 0){
              int rem = binary%10;
              dec += dec + rem*mul;
              mul *= 2;
              binary /= 10;
        }
        System.out.println(dec );
    }

    public void convertUsingForLoop(int binary){

        int dec = 0;
        int mul = 1;
        for (int i = binary; i > 0; i = i/10) {
            int rem = i % 10;
            dec = dec + rem*mul;
            mul *= 2;
        }
        System.out.println(dec);
    }
}

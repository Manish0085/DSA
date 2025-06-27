public class Main {
    public static void main(String[] args) {

//        BinaryToDecimal obj = new BinaryToDecimal();
//        obj.convertUsingForLoop( 110010);
        System.out.println(isUgly(6));
//        int x = 3, y = 6, result = 0;
//        for (int i = 1; i < 5; i++) {
//            result = result + (x*y);
//            x = x + 2;
//            y = y + 3;
//            System.out.println(result);
//        }
//        System.out.println(result);
    }

    public static boolean isUgly(int n) {
        if(n < 1){
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if((n % i == 0) && (i != 2 || i != 3 || i != 5)){
                return false;
            }
            else {
                continue;
            }
        }
        return true;
    }
}
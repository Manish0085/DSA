public class RotatedString {

    public static boolean isRotated(String str1, String str2){
        String result1 = rotateClockWise(rotateClockWise(str1));
        if (result1.equals(str2))
            return true;
        String result2 = rotateAntiClockWise(rotateAntiClockWise(str1));
        if (result2.equals(str2))
            return true;
        return false;
    }

    private static String rotateClockWise(String str){
        StringBuilder sb = new StringBuilder(str);
        char ch = str.charAt(str.length()-1);
        for (int i = str.length()-1; i > 0; i--) {
            sb.replace(i, i+1, String.valueOf(str.charAt(i-1)));
        }
        sb.replace(0, 1, String.valueOf(ch));
        return sb.toString();
    }
    private static String rotateAntiClockWise(String str){
        StringBuilder sb = new StringBuilder(str);
        char ch = str.charAt(0);
        for (int i = 0; i < str.length()-1; i++) {
            sb.replace(i, i+1, String.valueOf(str.charAt(i+1)));
        }
        sb.replace(str.length()-1, str.length(), String.valueOf(ch));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(isRotated("amazon", "azonam"));
    }
}

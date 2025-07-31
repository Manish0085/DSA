package StringRecursion;

public class ReverseStringUsingRecursion {

    public static String reverseString(String s){
//        StringBuilder sb = new StringBuilder(s);
//        return reverse1(sb, 0, s.length()-1);
        return reverse2(s, s.length()-1);
    }

    public static String reverse1(StringBuilder str, int start, int end){
        if (start >= end)
            return str.toString();

        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end, temp);
        return reverse1(str, start+1, end-1);

    }

    public static String reverse2(String s, int idx){
        if (idx < 0){
            return "";
        }

        return s.charAt(idx) + reverse2(s, --idx);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Education"));
    }


}

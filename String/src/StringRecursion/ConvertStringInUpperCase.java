package StringRecursion;

public class ConvertStringInUpperCase {

    public static void convert(String str, int idx, String result){
        if (idx < 0){
            System.out.println(result);
            return;
        }

        char ch = str.charAt(idx);
        ch = (char)('A' + (str.charAt(idx) - 'a'));
        convert(str, --idx, ch + result);

    }

    public static void main(String[] args) {

        convert("education", "education".length()-1, "");
    }
}

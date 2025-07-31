package StringRecursion;

public class CountVowelUsingRecursion {

    public static int countVowels(String s){
        return count(s,  s.length()-1);
    }

    public static int count(String str, int idx){
        if(idx < 0){
            return 0;
        }
        if (str.charAt(idx)  == 'A' || str.charAt(idx) == 'E' || str.charAt(idx)  == 'I' || str.charAt(idx) == 'U' || str.charAt(idx)  == 'O' ||
                str.charAt(idx)  == 'a' || str.charAt(idx) == 'e' || str.charAt(idx)  == 'i' || str.charAt(idx) == 'u' || str.charAt(idx)  == 'o') {
            return 1 + count(str, --idx);
        }
        return count(str, --idx);
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Education"));
    }
}

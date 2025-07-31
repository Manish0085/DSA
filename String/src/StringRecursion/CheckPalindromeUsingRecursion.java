package StringRecursion;

public class CheckPalindromeUsingRecursion {

    public boolean isPalindrome(String str){
        return check(str, 0, str.length()-1);
    }

    public boolean check(String str, int start, int end){
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end)){
            return false;
        }
        return check(str, start+1, end-1);
    }
}

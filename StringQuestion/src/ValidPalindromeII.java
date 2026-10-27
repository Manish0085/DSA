public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length();
        int count = 0;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right) && count == 1)
                return false;
            else if (s.charAt(left) != s.charAt(right) && count == 0)
                count++;

            left++;
            right--;
        }
        return true;
    }

}

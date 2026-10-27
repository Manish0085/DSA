public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while (left <= right) {
            while (left < right && !Character.isLetter(ch[left]))
                left++;
            while (left < right && !Character.isLetter(ch[right]))
                right--;

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }

        return new String(ch);
    }
}

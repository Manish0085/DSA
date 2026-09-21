public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length-1;
        if(digits[n] < 9) {
            digits[n]++;
            return digits;
        }
        int idx = n;
        while (idx >= 0) {
            if (digits[idx] != 9) {
                digits[idx] += 1;
                return digits;
            } else {
                digits[idx] = 0;
            }
            idx--;
        }

        int[] ans = new int[n+2];
        ans[0] = 1;
        return ans;
    }
}

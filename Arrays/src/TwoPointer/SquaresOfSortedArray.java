package TwoPointer;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int[] result = new int[n];
        for (int i = n-1; i >= 0 ; i--) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq < rightSq) {
                result[i] = rightSq;
                right--;
            } else {
                result[i] = leftSq;
                left++;
            }
        }
        return result;
    }

}

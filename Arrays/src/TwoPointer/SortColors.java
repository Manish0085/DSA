package TwoPointer;

public class SortColors {


    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                mid++;
                low++;
            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public void swap(int[]nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void sortColors1(int[] nums) {
        int zero = 0;
        int one = 0;
        for (int num: nums){
            if (num == 0) zero++;
            else if (num == 1) one++;
        }

        int i=0;
        while (zero-- > 0) nums[i++] = 0;
        while (one-- > 0) nums[i++] = 1;
        for (int j = i; j < nums.length; j++) {
            nums[j] = 2;
        }
    }


}

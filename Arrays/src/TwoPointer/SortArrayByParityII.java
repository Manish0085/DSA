package TwoPointer;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 1;

        while (even < n && odd < n) {
            if (nums[even] % 2 == 0) even += 2;
            else if (nums[odd] % 2 == 1) odd += 2;
            else {
                swap(nums, even, odd);
                even += 2;
                odd += 2;
            }
        }
        return nums;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] sortArrayByParityII2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(even + " " + odd + " " + i + " " + nums[i]);
            if (nums[i] % 2 == 0) {
                result[even] = nums[i];
                even += 2;
            }else {
                result[odd] = nums[i];
                odd += 2;
            }
        }
        return result;
    }

}

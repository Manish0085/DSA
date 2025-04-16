package Array;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public void brute(int[] nums1, int m, int[] nums2, int n){
        int[] result = new int[n+m];
        int left = 0, right = 0, index = 0;
        while (left < m && right < n){
            if (nums1[left] <= nums2[right]){
                result[index++] = nums1[left++];
            }
            else {
                result[index++] = nums2[right++];
            }
        }
        while (left < m){
            result[index++] = nums1[left++];
        }
        while (right < n){
            result[index++] = nums2[right++];
        }

        for (int i = 0; i < m+n; i++) {
            if(i < m){
                nums1[i] = result[i];
            }
            else
                nums2[i-m] = result[i];
        }
    }

    public void better(int[] nums1, int m, int[] nums2, int n){
        int left = nums1.length-1;
        int right = 0;
        while (left >= 0 && right < n){
            if (nums1[left] > nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }
            else {
                break;
            }
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int j = 0;
        for(int i=m; i<m+n; i++){
            nums1[i] = nums2[j++];
        }
    }


    private void swapIfGenerate(int[] num1, int[] num2, int ind1, int ind2){
        if (num1[ind1] > num2[ind2]){
            int temp = num1[ind1];
            num1[ind1] = num2[ind2];
            num2[ind2] = temp;
        }
    }

    public void optimal(int[] nums1, int m, int[] nums2, int n){
        int len = m+n;
        int gap = (len/2) + (len%2);
        while (gap > 0){
            int left = 0;
            int right = left+gap;
            while (right < left){
                if (left < n && right >= n){
                    swapIfGenerate(nums1, nums2, left, right-n);
                }
                else if (left >= n){
                    swapIfGenerate(nums2, nums2, left-n, right-n);
                }
                else {
                    swapIfGenerate(nums1, nums1, left, right);
                }
                left++; right++;
                if (gap == 1){
                    break;
                }
                gap = (gap/2)+(gap%2);
            }
        }
    }
}

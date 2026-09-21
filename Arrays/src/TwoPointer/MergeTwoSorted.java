package TwoPointer;

public class MergeTwoSorted {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];

        int i=0, j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k++] = nums1[i++];
            } else {
                ans[k++] = nums2[j++];
            }
        }

        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }

        k = 0;
        while (k < (n + m)) {
            nums1[k] = ans[k];
            k++;
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }

        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

    }
}

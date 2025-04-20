package BinarySeach;

public class MedianOfTwoSortedArrays {

    public int[] mergeArray(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int[] arr = new int[m+n];
        int k = 0;
        while (i < n && j < m){
            if (arr1[i] <= arr2[j]){
                arr[k++] = arr1[i++];
            } else  {
                arr[k++] = arr2[j++];
            }
        }
        while (i < n){
            arr[k++] = arr1[i++];
        }

        while (j < m){
            arr[k++] = arr1[j++];
        }
        return arr;
    }


    public double findMedian(int[] arr1, int[] arr2){
        int[] arr = mergeArray(arr1, arr2);
        int n = arr.length;
        if (n%2 == 1)
            return arr[n/2];
        else
            return ((double)arr[n/2]+(double)arr[(n/2)-1])/2.0;
    }

    public double better(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        int size = n + m;
        int idx2 = size/2;
        int idx1 = idx2-1;
        int count = 0;
        int idx1el = -1;
        int idx2el = -1;
        while (i < n && j < m){
            if (arr1[i] <= arr2[j]){
                if(count == idx1el) idx1el = arr1[i];
                if (count == idx2el) idx2el = arr1[i];
                i++; count++;
            }

            else {
                if(count == idx1el) idx1el = arr2[j];
                if (count == idx2el) idx2el = arr2[j];
                j++; count++;
            }
        }
        while (i < n){
            if(count == idx1el) idx1el = arr1[i];
            if (count == idx2el) idx2el = arr1[i];
            i++; count++;
        }
        while (j < m){
            if(count == idx1el) idx1el = arr2[j];
            if (count == idx2el) idx2el = arr2[j];
            j++; count++;
        }

        if (size%2 == 1)
            return idx2el;
        return (double) ((double)(idx1el+idx2el))/2.0;
    }

    public double optimal(int[] num1, int[] num2){
        int n1 = num1.length;
        int n2 = num2.length;
        int n = n1 + n2;
        if(n1 > n2){
            return better(num2, num1);
        }
        int low = 0;
        int high = n1;
        int left = (n1 + n2 + 1)/2;

        while (low <= high){
            int mid1 = (low + high)/2;
            int mid2 = left - mid1;
            int l1 = (mid1 -1 >= 0)? num1[mid1-1] :Integer.MIN_VALUE;
            int l2 = (mid2 -1 >= 0)? num2[mid2-1] :Integer.MIN_VALUE;
            int r1 = (mid1 < n1)? num1[mid1] :Integer.MAX_VALUE;
            int r2 = (mid2 < n2)? num2[mid2] :Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1){
                if (n % 2 == 1)
                    return Math.max(l1, l2);
                else
                    return (double) (Math.max(l1, l2)+Math.min(r1, r2))/2.0;
            } else if (l1 > r2) {
                high = mid1 - 1;
            }
            else
                low = mid1 + 1;
        }
        return 0;
    }
}

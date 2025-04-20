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
}

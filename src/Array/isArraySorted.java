package Array;

public class isArraySorted {

    public boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1])
                return false;
        }
        return true;
    }
}

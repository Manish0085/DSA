package BinarySeach;

public class RecursiveApproach {

    public int recursion(int[] arr, int target){
        return search(arr, 0, arr.length-1, target);

    }

    public int search(int[] arr, int low, int high, int target){
        int result = -1;
        if(low > high){
            return  result;
        }
        int mid = (low + high)/2;
        if (arr[mid] == target){
            int leftResult = search(arr, low, mid-1, target);
            return (leftResult != -1)? leftResult: mid;
        }
        else if(arr[mid] < target){
            return search(arr, mid+1, high, target);
        }
        else {
            return search(arr, low, mid-1, target);
        }
    }

}

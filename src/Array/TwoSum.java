package Array;

public class TwoSum {

    public int[] bruteForce(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j){
                    continue;
                } else if ((arr[i] + arr[j]) == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public int[] optimal(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            if((arr[i] + arr[j]) > target){
                j--;
            } else if ((arr[i] + arr[j]) < target) {
                i++;
            } else if ((arr[i] + arr[j]) == target) {
                return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}

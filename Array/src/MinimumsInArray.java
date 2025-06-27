public class MinimumsInArray {

    public int findMinimums(int[] arr1, int[] arr2){

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int secondMin1 = Integer.MAX_VALUE, secondMin2 = Integer.MAX_VALUE;
        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min1){
                secondMin1 = min1;
                min1 = arr1[i];
                idx1 = i;
            } else if (secondMin1 > arr1[i]) {
                secondMin1 = arr1[i];
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < min2){
                secondMin2 = min2;
                min2 = arr2[i];
                idx2 = i;
            } else if (secondMin2 > arr2[i]) {
                secondMin2 = arr2[i];
            }
        }
        if(idx1 != idx2){
            return min1+min2;
        }

        return Math.min(min1+secondMin2, min2+secondMin1);
    }
}

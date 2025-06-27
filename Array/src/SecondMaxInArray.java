public class SecondMaxInArray {

    public int findSecondMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (secondMax < arr[i] && max > arr[i]){
                secondMax = arr[i];
            }
        }
        return (secondMax == Integer.MIN_VALUE)? -1: secondMax;
    }
}

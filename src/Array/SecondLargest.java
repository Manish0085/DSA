package Array;

public class SecondLargest {


    public int bruteFore(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;


        }
        for (int i = n-2; i > 0; i--) {
            if (arr[n-1] != arr[i]){
                return arr[i];
            }
        }
        return 0;
    }

    public int findSecondLargest(int[] arr){
        int max = arr[0];
        int sMax = -1 ;
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                sMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > sMax) {
                sMax = arr[i];
            }
        }
        return sMax;
    }

    public int betterApproach(int[] arr){
        int first = -1;
        int second = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > first)
                first = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if(second < arr[i] && arr[i] != first)
                second = arr[i];
        }
        return second;
    }
}

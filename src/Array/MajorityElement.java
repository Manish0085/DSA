package Array;

public class MajorityElement {
    
    public int bruteForce(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]){
                    count++;
                }
            }
            if (count > (n/2)){
                return arr[i];
            }
        }
        return -1;
    }
}

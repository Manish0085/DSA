public class FindSmallestMissing {

    public int findSmallestPositive(int[] arr){
        int[] track = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 1 && arr[i] <= arr.length){
                track[arr[i]-1] = 1;
            }
        }
        for (int i = 0; i < track.length; i++) {
            if (track[i] != 1){
                return i+1;
            }
        }
        return arr.length;
    }
}

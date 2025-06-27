public class MissingInteger {


    public int findMissing(int[] arr){
        int[] track = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            track[arr[i]-1] = 1;
        }
        for (int i = 0; i < track.length; i++) {
            if (track[i] != 1){
                return i+1;
            }
        }
        return arr.length;
    }
}

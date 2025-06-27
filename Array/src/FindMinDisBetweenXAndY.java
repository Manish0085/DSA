public class FindMinDisBetweenXAndY {


    public int findMinDis(int[] arr, int x, int y){
        int idxX = -1, idxY = -1;
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                idxX = i;
                if(idxY != -1){
                    minDis = Math.min(minDis, Math.abs(idxX-idxY));
                }
            }

            if (y == arr[i]){
                idxY = i;
                if(idxX != -1){
                    minDis = Math.min(minDis, Math.abs(idxX-idxY));
                }
            }
        }
        return (minDis == Integer.MAX_VALUE)? -1: minDis;
    }
}

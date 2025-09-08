public class HeapHeight {

    public int height(int N, int[] arr){
        if(N == 1)
            return 1;

        int height = 0;
        while (N > 1){
            height++;
            N/=2;
        }
        return height;
    }
}

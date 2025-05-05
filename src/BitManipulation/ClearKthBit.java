package BitManipulation;

public class ClearKthBit {

    public static int clearKthBit(int n, int k){
        return (n & (~(1 << k)));
    }
}

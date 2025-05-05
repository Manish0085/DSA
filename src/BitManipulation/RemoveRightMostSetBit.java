package BitManipulation;

public class RemoveRightMostSetBit {

    public static int remove(int n){
        return (n & (n-1));
    }
}

package BitManipulation;

public class SetKthBit {

    public int setKthBit(int n, int k){
        return (n | (n << k));
    }
}

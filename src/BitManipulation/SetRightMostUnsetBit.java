package BitManipulation;

public class SetRightMostUnsetBit {

    public static int set(int n){
        return (n | (n+1));
    }
}

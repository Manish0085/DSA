package BitManipulation;

public class ToggleIthBit {

    public static int toggle(int n, int k){
        return (n ^ (1 << k));
    }
}

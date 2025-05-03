package BitManipulation;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class SwapTwoNumbersWithoutThirdNumber {

    public static List<Integer> usingXor(int a, int b){
        List<Integer> list = new ArrayList<>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        list.add(a);
        list.add(b);
        return list;
    }


//    public static List<Integer> usingOperation(int a, int b){
//        List<Integer> list = new ArrayList<>();
//        a = a - b;
//        b =
//    }
}

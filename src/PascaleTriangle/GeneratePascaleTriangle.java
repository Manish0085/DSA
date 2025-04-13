package PascaleTriangle;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class GeneratePascaleTriangle
{

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(optimal(i));
        }
        return list;
    }



    public List<Integer> optimal(int n) {
        List<Integer> list = new ArrayList<>();
        int ans  = 1;
        list.add(1);
        for (int i = 1; i < n; i++) {
            ans *= (n-i);
            ans /= i;
            list.add(ans);
        }
        return list;
    }
}

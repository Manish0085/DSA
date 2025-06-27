import java.util.ArrayList;

public class FindNumberOfElementsBetTwoNum {


    public int findOccurrence(ArrayList<Integer> arr, int num1, int num2){
        int i = arr.indexOf(num1);
        int j = arr.indexOf(num2);
        return j-i-1;
    }
}

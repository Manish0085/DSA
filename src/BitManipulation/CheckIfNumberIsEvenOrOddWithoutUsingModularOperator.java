package BitManipulation;

public class CheckIfNumberIsEvenOrOddWithoutUsingModularOperator {

    public static boolean check(int n){
        if ((n & 1) == 1)
            return false;

        return true;
    }
}

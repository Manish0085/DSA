public class MaximumStepToMakeIntegerZero {


    public int makeIntZero(int num1, int num2){
        int t = 0;
        while (t <= 60){
            long val = (long) num1 - (long)t * num2;
            if (val >= t && t <= Long.bitCount(val)){
                return t;
            }
        }
        return -1;
    }
}

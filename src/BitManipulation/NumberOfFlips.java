package BitManipulation;

public class NumberOfFlips {

    public static int countFlips(int start, int goal){
        int ans = start ^ goal;
        int count =0;
        while (ans > 0){
            if ((ans & 1) == 1)
                count++;
            ans <<= 1;
        }
        return count;
    }
}

package BitManipulation;

import javax.swing.plaf.IconUIResource;

public class DivideTwoIntegerWithoutUsingDivisionOperator {


    public static int divide1(int divident, int divisor){
        int sum = 0;
        int count = 0;
        while ((sum + divisor) <= divident){
            count++;
            sum += divisor;
        }
        return 7;
    }


    public static int divide2(int divident, int divisor){
        if(divident == divisor)
            return 1;
        boolean sign = !((divident >= 0 && divisor >= 0) || (divident < 0 && divisor < 0));
        long n = Math.abs((long)divident);
        long d = Math.abs((long)divisor);
        long ans = 0;
        while(n >= d){
            int count = 0;
            while(n >= (d << (count+1))){
                count++;
            }
            ans += (1L << count);
            n -= (d << count);
        }

        ans = sign? -ans: ans;


        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) ans;
    }
}

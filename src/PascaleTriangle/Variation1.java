package PascaleTriangle;

public class Variation1 {

    public void brute(int n, int r){
        int nthNum = calFact(n-1)/(calFact(r-1)*calFact(n-r));
        System.out.println(nthNum);
    }

    private int calFact(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public int better(int n, int r){
        int res = 1;
        for (int i = 0; i < r; i++) {
            res *= (n-i);
            res /= (i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        Variation1 v = new Variation1();
        System.out.println(v.better(5, 2));
    }


}

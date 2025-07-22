import java.util.TreeSet;

public class PrintAllDivisorsOfNumber {

    public void print1(int n){
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i+" ");
        }
    }

    public void print2(int n){

        TreeSet<Integer> tree = new TreeSet<>(); // to store the divisors in sorted order
        for (int i = 1; i*i <= n; i++) {
            if (n % i == 0){
                tree.add(i);
                tree.add(n/i);
            }
        }

        for (Integer num: tree)
            System.out.print(num+" ");
    }
}

import static java.lang.Math.pow;

public class DecimalToBinary {

    public void convert(int dec){
        int n = dec;
        int bin = 0;
        int count = 0;
        while (n > 0){
            bin = (int)(bin + (n % 2)*pow(10, count));
            n /= 2;
            count++;
        }

        System.out.println(bin);
    }


    public void convertUsingSB(int dec){
        int n = dec;
        StringBuilder str = new StringBuilder();
        while (n > 0){
            str.append(n%2);
            n /= 2;
        }

        System.out.println(str.reverse().toString());
    }



    public void convert1(int dec){
        int n = dec;
        int mul = 1;
        int bin = 0;
        while (n > 0){
            bin = bin + (n % 2)*mul;
            n /= 2;
            mul *= 10;
        }

        System.out.println(bin);
    }

}

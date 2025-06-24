public class Pattern1 {

    public void printPatten1(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPatten2(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("10 ");
            }
            System.out.println();
        }
    }

    public void printPatten3(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    public void printPatten4(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    public void printPatten5(){
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public void printPatten6(){
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void printPatten7(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i*i)+" ");
            }
            System.out.println();
        }
    }

    public void printPatten8(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((j*j)+" ");
            }
            System.out.println();
        }
    }


    public void printPatten9(){
        for (int i = 'a'; i <= 'e'; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print((char) i+" ");
            }

            System.out.println();
        }
    }

    public void printPatten10(){
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print((char) j+" ");
            }

            System.out.println();
        }
    }

    public void printPatten11(){
        for (int i = 1; i <= 5; i++) {
            char name = (char)('a'+i-1);
            for (int j = 1; j <= 5; j++) {
                System.out.print(name+" ");
            }

            System.out.println();
        }
    }

    public void printPatten12(){
        for (int i = 1; i <= 5; i++) {
            char name = 'a';
            for (int j = 1; j <= 5; j++) {
                System.out.print((char) (name+j-1)+" ");
            }

            System.out.println();
        }
    }


    public void printPatten13(){
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }

    public void printPatten14(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((((i-1)*5)+j)+" ");
            }

            System.out.println();
        }
    }


//Home work sheet
    public void printPatten15(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((j*j*j)+" ");
            }
            System.out.println();
        }
    }

    public void printPatten16(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 'F'; j <= 'J'; j++) {
                System.out.print((char) j+" ");
            }
            System.out.println();
        }
    }

    public void printPatten17(){
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                char name = (char) ('F'+j-1);
                System.out.print(name+" ");
            }
            System.out.println();
        }
    }

}

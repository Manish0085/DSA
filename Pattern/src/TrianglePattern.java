public class TrianglePattern {

    public void printPattern1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern2(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


    public void printPattern3(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public void printPattern4(){
        for (int i = 1; i <= 5; i++) {
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
        }
    }

    public void printPattern5(){
        for (int i = 1; i <= 5; i++) {

            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");

            }
            System.out.println();
        }
    }

    public void printPattern6() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if(j >= 6-i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printPattern7(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('a'+i-1)+" ");
            }
            System.out.println();
        }
    }

    public void printPattern8(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPattern9(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printPattern10(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printPattern11(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print(j+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void printPattern12() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if(j >= 6-i){
                    System.out.print((char) ('A'+i-1)+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public void printPattern13() {
        for (int i = 1; i <= 5; i++) {
            int num = i;
            for (int j = 1; j <= 5; j++) {

                if(j >= 6-i){
                    System.out.print(num+" ");
                    num--;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    public void printPattern14() {
        for (int i = 1; i <= 5; i++) {
            int num = 5;
            for (int j = 1; j <= 5; j++) {

                if(j >= 6-i){
                    System.out.print(num+" ");
                    num--;
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


}


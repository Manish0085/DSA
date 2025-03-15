import Array.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.print("Enter the size of array ");
//        int m = sc.nextInt();
//        int[] srr = new int[n];
//        System.out.print("Enter the elements ");
//        for (int i = 0; i < m; i++) {
//            srr[i] = sc.nextInt();
//        }
        FindMissingNumber element = new FindMissingNumber();
//        System.out.println(element.rotate(arr));
        System.out.println(element.better(arr));

    }
}
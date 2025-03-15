package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountFreqFor1BasedIndexing {

    public static List<Integer> countFreq(int[] arr){
        int n = arr.length;
        List<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));
        for (int i = 0; i < n; i++) {
            list.set(arr[i]-1, list.get(arr[i]-1)+1);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the array size ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(countFreq(arr));
    }
}

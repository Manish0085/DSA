package AdjacencyMatrix;

import java.util.Scanner;

public class DUG {

    private int[][] adjMat;
    private int vertices;

    public DUG(int size){
        this.adjMat = new int[size][size];
        this.vertices = size;
    }


    public void addEdge(int u, int v){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjMat[u][v] = 1;
        } else {
            System.out.println("Invalid edge!");
        }
    }

    public void removeEdge(int u, int v){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjMat[u][v] = 0;
        } else {
            System.out.println("Invalid edge!");
        }
    }

    public void printGraph(){
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices ");
        int n = sc.nextInt();

        DUG obj = new DUG(n);

        System.out.print("Enter the number of edges ");
        int e = sc.nextInt();

        System.out.println("Enter the vertex(u, v) ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }

        obj.printGraph();
    }
}

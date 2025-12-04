package AdjacencyMatrix;

import java.util.Scanner;

public class DWG {

    private int[][] adjMat;
    private int vertices;


    public DWG(int size){
        this.adjMat = new int[size][size];
        this.vertices = size;
    }

    public void addEdge(int u, int v, int weight){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjMat[u][v] = weight;
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

        DWG obj = new DWG(n);
        System.out.print("Enter the number of edges ");
        int e = sc.nextInt();

        System.out.println("Enter the vertex (u, v) and weight ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            obj.addEdge(u, v, w);
        }

        obj.printGraph();
    }
}

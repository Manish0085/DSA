package AdjacencyMatrix;

import java.util.Scanner;

public class UUG {


    private int vertices;
    private int[][] adjacencyMatrix;


    public UUG(int size){
        this.vertices = size;
        this.adjacencyMatrix = new int[size][size];
    }


    public void addEdge(int u, int v){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjacencyMatrix[u][v] = 1;
            adjacencyMatrix[v][u] = 1;
        } else {
            System.out.println("Invalid edge!");
        }
    }


    public void removeEdge(int u, int v){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjacencyMatrix[u][v] = 0;
            adjacencyMatrix[v][u] = 0;
        } else {
            System.out.println("Invalid edge!");
        }
    }


    public void printGraph(){
        System.out.println("\nAdjacency Matrix");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of vertices ");
        int n = sc.nextInt();
        UUG obj = new UUG(n);

        System.out.print("Enter the number of edges ");
        int e = sc.nextInt();

        System.out.print("Enter edges (u, v) ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }

        obj.printGraph();
    }
}

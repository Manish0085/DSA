package AdjacencyList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class DUG {

    private int vertices;
    private LinkedList<Integer>[] adjList;


    public DUG(int size){
        this.vertices = size;
        this.adjList = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            adjList[i] = new LinkedList<>();
        }
    }


    public void addEdge(int u, int v){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjList[u].add(v);
        } else {
            System.out.println("Invalid edge!");
        }
    }

    public void removeEdge(int u, int v){
        if (u >= 0  && v >= 0 && u < vertices && v < vertices){
            adjList[u].remove(v);
        } else {
            System.out.println("Invalid Edge!");
        }
    }

    public void  printGraph(){
        for (int i = 0; i < vertices; i++) {
            System.out.print("vertex " + i + " --> ");
            for (Integer node: adjList[i]){
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();
        DUG obj = new DUG(n);

        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the vertex (v, u) and weight");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            obj.addEdge(u, v);
        }
        obj.printGraph();
    }
}

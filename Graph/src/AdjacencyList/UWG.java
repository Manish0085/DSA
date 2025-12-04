package AdjacencyList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class UWG {

    private int vertices;
    private LinkedList<Map<Integer, Integer>>[] adjList;

    public UWG(int size){
        this.vertices = size;
        this.adjList = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v, int w){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjList[u].add(Collections.singletonMap(v, w));
            adjList[v].add(Collections.singletonMap(u, w));
        } else {
            System.out.println("Invalid edge!");
        }
    }

    public void removeList(int u, int v){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            adjList[u].removeIf(map -> map.containsKey(v));
            adjList[v].removeIf(map -> map.containsKey(u));
        } else {
            System.out.println("Invalid edge!");
        }
    }

    public void printGraph(){
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + " --> ");
            for (Map<Integer, Integer> map: adjList[i]){
                for (Map.Entry<Integer, Integer> set: map.entrySet()){
                    System.out.print("(" + set.getKey() + ", w=" + set.getValue() + ") ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();
        UWG obj = new UWG(n);

        System.out.print("Enter the number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter the vertex (v, u) and weight");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            obj.addEdge(u, v, w);
        }
        obj.printGraph();
    }
}

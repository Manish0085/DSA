package AdjacencyList;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class DWG {

    private int vertices;
    private LinkedList<Map<Integer, Integer>>[] addList;

    public DWG(int size){
        this.vertices = size;
        this.addList = new LinkedList[size];

        for (int i = 0; i < size; i++) {
            addList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v, int w){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            Map<Integer, Integer> map = new HashMap<>();
            map.put(v, w);
            addList[u].add(map);
        }
        else {
            System.out.println("Invalid Edge!");
        }
    }

    public void removeEdge(int u, int v, int w){
        if (u >= 0 && v >= 0 && u < vertices && v < vertices){
            Map<Integer, Integer> map = new HashMap<>();
            map.put(v, w);
            addList[u].add(map);
        }
        else {
            System.out.println("Invalid Edge!");
        }
    }

    public void printGraph(){
        for (int i = 0; i < vertices; i++) {
            System.out.print("vertex " + i + " --> ");
            for(Map<Integer, Integer> map : addList[i]){
                for (Map.Entry<Integer, Integer> entry: map.entrySet()){
                    System.out.print("(" + entry.getKey() + ", w=" + entry.getValue() + ") ");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();
        DWG obj = new DWG(n);

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

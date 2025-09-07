import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxHeap {

    int[] arr;
    int size; // total elements in heap
    int total_size; // total size of array


    public MaxHeap(int n){
        this.arr = new int[n];
        this.size = 0;
        this.total_size = n;
    }

    // insert into heap
    public void insert(int value){
        // if heap size is available or not
        if (this.size == this.total_size){
            System.out.println("Heap Overflow: "+value+" can't be inserted");
            return;
        }

        arr[size] = value;
        int index = size;
        size++;

        // compare it with its parent
        while (index > 0  && arr[(index - 1)/2] < arr[index]){
            int temp = arr[(index - 1)/2];
            arr[(index - 1)/2] = arr[index];
            arr[index] = temp;
            index = (index-1)/2;
        }

        System.out.println(arr[index] + " inserted into the heap");
    }

    void print(){
        System.out.println("Heap : ");
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println("end");
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(6);
        maxHeap.insert(4);
        maxHeap.insert(14);
        maxHeap.insert(11);
        maxHeap.insert(114);
        maxHeap.insert(24);
        maxHeap.insert(1);
        maxHeap.insert(10);
        maxHeap.print();
    }

}

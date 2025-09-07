import java.lang.reflect.Array;
import java.time.chrono.MinguoDate;
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


    void delete(){
        if (this.size == 0){
            System.out.println("Heap Underflow");
            return;
        }

        System.out.println(arr[0] + " deleted from the heap");
        arr[0] = arr[size - 1];
        size--;
        if (this.size == 0){
            return;
        }

        heapify(0);
    }

    private void heapify(int index){
        int largest = index;
        int left = 2*index + 1;
        int right = 2*index + 2;

        // largest will store the index of the element which is greater among parent, left child and right child
        if (left < this.size && arr[largest] < arr[left]){
            largest = left;
        } if(right < this.size && arr[largest] < arr[right]){
            largest = right;
        }
        if (largest != index){
            int temp = arr[index];
            arr[index] = arr[largest];
            arr[largest] = temp;
            heapify(largest);
        }
    }

    void print(){
        if(this.size == 0){
            System.out.println("Heap Underflow");
            return;
        }
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
        maxHeap.delete();
        maxHeap.print();
        maxHeap.insert(114);
        maxHeap.insert(24);
        maxHeap.insert(1);
        maxHeap.insert(10);
        maxHeap.print();
        maxHeap.delete();
        maxHeap.delete();
        maxHeap.delete();
        maxHeap.print();
        maxHeap.delete();
        maxHeap.delete();
        maxHeap.delete();
        maxHeap.print();
        maxHeap.delete();
    }

}

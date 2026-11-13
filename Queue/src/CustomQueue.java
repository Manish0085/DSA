public class CustomQueue
{

    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;
    public CustomQueue(int capacity) {
        this.arr = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.capacity = capacity;
    }

    public boolean enqueue(int x) {
        if (isFull())
            return false;

        arr[++rear] = x;
        size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty())
            return -1;
        int removed = arr[front];
        arr[front] = -1;
        front++;
        size--;
        return removed;
    }

    public int getFront() {
        if (isEmpty())
            return -1;
        return arr[front];
    }

    public int getRear() {
        if (isEmpty())
            return -1;
        return arr[rear];
    }
    public int getSize() {
        return this.size;
    }
    public boolean isEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        if (rear == capacity-1)
            return true;
        return false;
    }
}

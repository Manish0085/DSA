package Implementation;

public class UsingArray {

    int[] arr;
    int size;
    int top;
    boolean flag;

    public UsingArray(int size){
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }


    public void push(int value){
        if (top == size-1){
            System.out.println("Stack overflow");
            return;
        }
        flag = false;
        arr[++top] = value;
    }

    public int pop(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int temp = top;
        top--;
        return arr[temp];
    }

    public int peek(){
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        } else if (size() == 0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        if (top == -1)
            return true;
        return false;
    }

    public int size(){
        return top + 1;
    }

    public int get(int i){
        return arr[i];
    }

    public static void main(String[] args) {
        UsingArray stack = new UsingArray(6);


        stack.pop();
        stack.pop();
        stack.pop();
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i)+" ");
        }

        System.out.println("\n"+stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

    }
}

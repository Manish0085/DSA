package Implementation;


import java.util.Stack;

class Node {

    int data;
    Node next;


    public Node(int data){
        this.data = data;
        this.next = null;
    }



    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class UsingLinkedList {


    Node top;
    int size;


    public UsingLinkedList(){
        this.top = null;
        this.size = 0;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (newNode == null){
            System.out.println("Stack Overflow");
            return;
        }
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop(){
        if (top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        Node temp = top;
        top = top.next;
        size--;
        return temp.data;
    }

    public int peek(){
        if (top == null){
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return top == null;
    }




    public static void main(String[] args) {
        UsingLinkedList stack = new UsingLinkedList();

        stack.push(5);
        stack.push(21);
        stack.push(9);
        stack.push(61);
        stack.push(45);

        stack.pop();
        stack.pop();
        stack.pop();




        System.out.println("\n"+stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
    }
}


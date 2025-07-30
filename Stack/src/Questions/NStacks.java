package Questions;


import javax.swing.*;
import java.util.Stack;

class Node {
    int index;
    Node next;

    public Node(int x){
        this.index = x;
        this.next = null;
    }
}
public class NStacks {

    int[] arr;  // original data
    Node[] top;  // top element's index of particular list
    Stack<Integer> stack;  // to store empty blocks


    public NStacks(int N, int S){
        this.arr = new int[S];
        this.top = new Node[N];
        for (int i = 0; i < N; i++) {
            this.top[i] = null;
        }
        this.stack = new Stack<>();
        for (int i = 0; i < S; i++) {
            this.stack.push(i);
        }

    }

    // x:- value
    // m:- no. of stack in which the value to be pushed
    public void push(int x, int m){
        if (stack.isEmpty()){
            return;
        }
        arr[stack.peek()] = x;
        Node node = new Node(stack.peek());
        node.next = top[m-1];
        top[m-1] = node;
        stack.pop();
    }

    public int pop(int m){
          if (top[m-1] == null){
              return -1;
          }
          stack.push(top[m-1].index);
          int element = arr[top[m-1].index];
          top[m-1] = top[m-1].next;

          return element;
    }
}

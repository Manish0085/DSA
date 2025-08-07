package Recursion;

public class ReverseLL {

    public Node reverse(Node head, Node pre){
        if(head == null)
            return pre;

        Node fut = head.next;
        head.next = pre;
        return reverse(fut, head);

    }
}

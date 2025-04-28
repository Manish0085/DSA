package LinkedList;


class Node {
    int data;
    Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Initialization {

    public static void main(String[] args) {
        Node x = new Node(4, null);
        System.out.println(x.next);
    }

}

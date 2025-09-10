import java.util.PriorityQueue;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MergeKSortedLinkedList {


    Node mergeKLists(Node[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Node node: arr){
            Node temp = node;
            while (temp != null){
                pq.offer(temp.data);
                temp = temp.next;
            }
        }

        Node root = new Node(pq.poll());
        Node node = root;
        while (!pq.isEmpty()){
            node.next = new Node(pq.poll());
            node = node.next;
        }
        return root;
    }
}

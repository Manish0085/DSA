import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class CopyListWithRandomPointer
{
    public Node copyRandomList(Node head) {

        Map<Node, Node> hash = new HashMap<>();
        Node temp = head;
        Node dummy = new Node(-1);
        Node p = dummy;
        while (temp != null) {
            dummy.next = new Node(temp.val);
            dummy = dummy.next;
            hash.put(temp, dummy);
            temp = temp.next;
        }

        dummy = p.next;
        temp = head;
        while (temp != null) {
            Node random = temp.random;
            dummy.random = hash.get(random);
            dummy = dummy.next;
            temp = temp.next;
        }
        return p.next;
    }
}

class Node2 {
    public int val;
    public Node2 prev;
    public Node2 next;
    public Node2 child;

    public Node2(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
        this.child = null;
    }
}
public class FlattenMultilevelDoublyLL {

    public Node2 flatten(Node2 head) {
        if(head == null)
            return head;


        Node2 temp = head;
        while (temp != null) {
            if (temp.child == null) {
                temp = temp.next;
            } else {
                Node2 childTail = temp.child;
                while (childTail.next != null) {
                    childTail = childTail.next;
                }
                childTail.next = temp.next;
                if (temp.next != null)
                    temp.next.prev = childTail;
                temp.next = temp.child;
                temp.child.prev = temp;
                temp.child = null;
                temp = temp.next;

            }
        }
        return head;
    }
}

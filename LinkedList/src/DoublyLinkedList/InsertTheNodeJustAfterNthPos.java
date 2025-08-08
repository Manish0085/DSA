package DoublyLinkedList;

import java.lang.reflect.AnnotatedElement;

public class InsertTheNodeJustAfterNthPos {

    // Assuming that the indexing is 0-based
    public Node insert(Node head, int p, int x){
        if (head == null && p == 0){
            head = new Node(x);
            return head;
        }



        Node temp = head;
        for (int i = 0; i < p; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(x);
        Node fut = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        if (fut != null){
            fut.prev = newNode;
            newNode.next = fut;
        }

        return head;
    }
}

package DoublyLinkedList;

public class DeleteAllOccurrencesOfKey {

    public Node deleteKey(Node head, int key){
        Node temp = head;
        while (temp != null){
            if (temp.data == key){
                if (temp == head){
                    head = temp.next;
                }
                Node nexNode = temp.next;
                Node prevNode = temp.back;
                if (nexNode != null)
                    nexNode.back = prevNode;
                if (prevNode != null)
                    prevNode.next = nexNode;
                temp = nexNode;
            }
            else
                temp = temp.next;
        }
        return head;
    }
}

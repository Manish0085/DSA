package DoublyLinkedList;

public class RemoveDuplicates {

    public static Node removeDuplicates(Node head){
        if (head == null || head.next == null)
            return head;

        Node temp = head;
        while (temp != null && temp.next != null){
            Node nextNode = temp.next;
            while (nextNode != null && temp.data == nextNode.data){
                nextNode = nextNode.next;
            }

            temp.next = nextNode;
            if (nextNode != null){
                nextNode.back = temp;
            }
            temp = nextNode;
        }
        return head;
    }
}

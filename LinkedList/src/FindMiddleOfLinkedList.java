public class FindMiddleOfLinkedList {

    public Node findMiddel(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}

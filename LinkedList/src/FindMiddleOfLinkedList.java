public class FindMiddleOfLinkedList {

    public Node findMiddel1(Node head){
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


    public Node findMiddel2(Node head){
        if(head == null || head.next == null){
            return head;
        }

        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }

        temp = head;
        int mid = count/2;

        while (mid-- > 0){
            temp = temp.next;
        }
        return temp;
    }
}

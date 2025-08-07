public class RemoveNthNode {

    public Node removeNthFromEnd(Node head, int n) {
        if (head == null){
            return head;
        }


        int count = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            count++;
        }

        int step = count - n;
        if(step == 0){
            return head.next;
        }
        temp = head;
        while (step-- > 1){
            temp = temp.next;
        }


        if(temp.next != null){
            temp.next = temp.next.next;
        }
        return head;

    }


    public Node removeNthFromEnd2(Node head, int n) {
        if (head == null){
            return head;
        }

        Node fast = head;
        Node slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }


        if(fast == null)    // You need to remove the fast node
            return head.next;

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        if (slow.next != null){
            slow.next = slow.next.next;
        }

        return head;
    }


}

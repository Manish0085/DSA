public class DeleteEachNthNode {

    Node deleteK(Node head, int k) {
        if (k == 1)
            return null;
        Node temp = head;
        Node pre = null;
        int count = 1;
        while (temp != null){
            if(count == k){
                pre.next = temp.next;
                temp = pre.next;
                count = 1;
            }else {
                pre = temp;
                temp = temp.next;
                count++;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        // Create first linked list: 1 -> 3 -> 5
        Node head1 = new Node(10);
        head1.next = new Node(9);
//        head1.next.next = new Node(5);

        // Create second linked list: 2 -> 4 -> 6 -> 8 -> 10
        Node head2 = new Node(6);
        head2.next = new Node(1);
        head2.next.next = new Node(2);
        head2.next.next.next = new Node(3);
        head2.next.next.next.next = new Node(4);
        head2.next.next.next.next.next = new Node(5);
    }
 }

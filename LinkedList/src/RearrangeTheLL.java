public class RearrangeTheLL {


    public Node rearrangeOddEven(Node head){
        if (head == null){
            return null;
        }

        Node newHead = new Node(head.data);
        Node temp = head;
        while (temp != null){

        }

        return null;
    }

    public static void printLL(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        // Create first linked list: 1 -> 3 -> 5
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);

        RearrangeTheLL rearrange = new RearrangeTheLL();
        rearrange.rearrangeOddEven(head1);



        System.out.println("\nRearranged Linked list:");
        printLL(head1);
    }
}

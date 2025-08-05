public class MergeLinkedListAlternatively {


    public Node[] mergeList(Node head1, Node head2){
        if(head1 == null || head2 == null)
            return new Node[]{head1, head2};

        Node h1 = head1;
        Node h2 = head2;

        while (h1 != null && h2 != null){
            Node t1 = h1.next;
            Node t2 = h2.next;
            h1.next = h2;
            h2.next = t1;

            h1 = t1;
            h2 = t2;
        }


        return new Node[]{head1, h2};
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

        MergeLinkedListAlternatively merger = new MergeLinkedListAlternatively();
        Node[] result = merger.mergeList(head1, head2);

        System.out.println("\nMerged first list:");
        printLL(result[0]);

        System.out.println("\nRemaining second list:");
        printLL(result[1]);
    }

}

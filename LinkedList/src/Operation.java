public class Operation {

    public Node insert(Node head, int data){

        if(head == null){
            head = new Node(data);
            return head;
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }


    public Node insertAtLast(Node head, int data){

        if(head == null){
            head = new Node(data);
            return head;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        return head;
    }


    public Node insertAtGivenPos(Node head, int value, int pos) {
        Node newNode = new Node(value);

        if (pos == 0) { // Insertion at head
            newNode.next = head;
            return newNode;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds");
                return head;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }


}

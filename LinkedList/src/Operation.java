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
        temp.next = new Node(data);
        return head;
    }

}

package DoublyLinkedList;

public class Operation {

    public Node insertAtBeginning(Node head, int data){
        if (head == null){
            head = new Node(data);
            return head;
        }

        Node newNode = new Node(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;;
        return head;
    }


    public Node insertAtEnd(Node head, int data){
        if (head == null){
            head = new Node(data);
            return head;
        }

        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;

    }

    public Node insertAtGivenPos(Node head, int data, int pos){
        if (head == null && pos == 1){
            head = new Node(data);
            return head;
        }

        Node newNode = new Node(data);
        if (pos == 1){
            newNode.next = head;
            if (head != null)
                head.prev = newNode;;
            return newNode;
        }
        Node temp = head;
        for (int i = 1; i < pos-1; i++) {
            temp = temp.next;
            if (temp == null){
                System.out.println("Invalid position");
                return head;
            }
        }
        Node fut = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        if (fut != null) {
            fut.prev = newNode;
            newNode.next = fut;
        }

        return head;
    }


    public Node deleteFirst(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        return head;

    }

    public Node deleteLast(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
        temp.prev = null;
        return head;

    }

    public Node deleteFromPos(Node head, int pos){
        if (head == null ){
            return null;
        }

        if (pos == 0){
            head = head.next;
            if (head != null){
                head.prev = null;
            }
            return head;
        }

        Node temp = head;

        for (int i = 0; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null){
            System.out.println("Invalid position");
            return null;
        }
        if(temp.prev != null)
            temp.prev.next = temp.next;
        if (temp.next != null)
            temp.next.prev = temp.prev;
        return head;

    }



    public static void main(String[] args) {
        Operation op = new Operation();

        Node head = null;
        Node node1 = op.insertAtBeginning(head, 45);
        Node node2 = op.insertAtBeginning(node1, 2);
        Node node3 = op.insertAtBeginning(node2, 3);
        Node node4 = op.insertAtEnd(node3, 44);
        Node node5 = op.insertAtEnd(node4, 39);
        Node node6 = op.insertAtEnd(node5, 91);
        Node node7 = op.insertAtGivenPos(node6, 33, 4);
//        node7 = op.deleteFirst(node7);
        node7 = op.deleteFromPos(node7, 8);

        Node temp = node7;
        while (temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }

    }
}

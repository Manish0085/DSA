package DoublyLinkedList;

public class ConvertArrayIntoDLL {

    public static Node convert1(int[] arr){
        if (arr.length == 0){
            System.out.println("Array is empty. Can't create the LinkedList");
            return null;
        }

        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }

        return head;
    }


    public static Node convert2(int[] arr){
        if (arr.length == 0){
            System.out.println("Array is empty. Can't create the LinkedList");
            return null;
        }

        Node head = null;
        Node tail = null;
        for (int i = 0; i < arr.length; i++) {
            if (head == null){
                head = new Node(arr[i]);
                tail = head;
            } else {
                Node newNode = new Node(arr[i]);
                tail.next = newNode;
                newNode.prev = tail;
                tail = tail.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convert2(arr);
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
}

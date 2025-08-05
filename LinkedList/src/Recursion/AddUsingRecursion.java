package Recursion;



public class AddUsingRecursion {

    public static Node insertAtLast(int[] arr, int idx){
        if (idx == arr.length)
            return null;

        Node node = new Node(arr[idx]);
        node.next = insertAtLast(arr, ++idx);
        printLL(node);
        return node;
    }


    public static Node insertAtStart(int[] arr, int idx){
        if (idx < 0)
            return null;

        Node node = new Node(arr[idx]);
        node.next = insertAtStart(arr, --idx);
        printLL(node);
        return node;
    }



    public static Node insertAtStart2(int[] arr, int idx, Node prev){
        if (idx == arr.length)
            return prev;

        Node node = new Node(arr[idx]);
        node.next = prev;
        return insertAtStart2(arr, ++idx, node);


    }

    public static void printLL(Node head){
        if (head == null){
            System.out.println("null");
            return;
        }

        System.out.print(head.data+" --> ");
        printLL(head.next);
    }


    public static Node delete(Node node, int pos){
        if (node == null){
            System.out.println("Invalid pos");
            return null;
        }


        if (pos == 1)
            return node.next;

        node.next = delete(node.next, --pos);
        return node;
    }



    public static void main(String[] args) {
        int[] arr = {4, 5, 81, 2, 3};
        Node head = null;
        Node insert = insertAtStart2(arr, 0, null);
        printLL(insert);
        printLL(insert);
    }

}

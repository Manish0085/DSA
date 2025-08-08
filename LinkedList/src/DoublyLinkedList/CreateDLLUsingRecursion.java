package DoublyLinkedList;

public class CreateDLLUsingRecursion {

    public Node createDLL(int[] arr, int idx, Node node){

        if(idx == -1){
            return null;
        }
        Node newNode = new Node(arr[idx]);
        newNode.prev = node;
        newNode.next = createDLL(arr, --idx, newNode);
        return newNode;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        CreateDLLUsingRecursion obj = new CreateDLLUsingRecursion();
        Node head = obj.createDLL(arr, arr.length-1, null);
        Node trav = head;
        while (trav != null){
            System.out.print(trav.data + " --> ");
            trav = trav.next;
        }
        System.out.println("null");
    }

}

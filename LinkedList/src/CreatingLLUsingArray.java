public class CreatingLLUsingArray {



    public static void createLL(Node head, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(head == null){
                head = new Node(arr[i]);
            }
            else {
                Node temp = new Node(arr[i]);
                temp.next = head;
                head = temp;
            }
        }
        printLL(head);
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
        int[] arr = {4, 5, 81, 2, 3};
        Node head = null;
        createLL(head, arr);

    }
}

package LinkedList;


public class RotateList {

    public static Node rotate(Node head, int k){

        if (head == null)
            return head;

        Node tail = head;
        int len = 1;
        while (tail.next != null){
            len++;
            tail = tail.next;
        }
        if(len == k)
            return head;

        k = k % len;
        Node nextLastNode = find(head, len-k);
        head = nextLastNode.next;
        nextLastNode.next = null;
        return head;

    }

    private static Node find(Node temp, int k){
        int count = 1;
        while (temp != null){
            count++;
            if (count == k)
                break;
            temp = temp.next;
        }
        return temp;
    }
}

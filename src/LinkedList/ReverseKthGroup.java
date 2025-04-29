package LinkedList;

public class ReverseKthGroup {

    private static Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        while (current != null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    private static Node findKthNode(Node temp, int k){
        k -= 1;
        while (temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    public static Node reverseKthGroup(Node head, int k){
        Node temp = head;
        Node prevNode = null;
        while (temp != null){
            Node kthNode = findKthNode(temp, k);
            if (kthNode == null){
                if (prevNode != null){
                    prevNode.next = temp;
                }
                break;
            }
            Node nextNode = temp.next;
            reverse(temp);
            if (temp == head){
                head = kthNode;
            }
            else {
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = nextNode;

        }
        return head;
    }
}

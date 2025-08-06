import static Recursion.AddUsingRecursion.printLL;

public class RotateListByKPlaces {


    public Node rotateToRight1(Node head, int k){
        if (head == null || head.next == null || k == 0)
            return head;

        int count = 1;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            count++;
        }

        temp.next = head;
        k = k % count;
        if (k == 0){
            temp.next = null;
            return head;
        }

        int stepsToMove = count - k;
        Node newTail = head;
        while (stepsToMove-- > 1){
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;

    }

    public Node rotateToLeft(Node head, int k){
        if (head == null || head.next == null || k == 0){
            return head;
        }

        int count = 1;
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
            count++;
        }

        k = k % count;
        if (k == 0){
            return head;
        }
        temp.next = head;
        Node newTail = head;
        while (k-- > 1){
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}

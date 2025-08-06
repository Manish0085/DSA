import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {


    public Node reverse(Node head){
        if (head == null || head.next == null){
            return head;
        }

        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null){
            list.add(temp.data);
            temp = temp.next;
        }

        temp = head;
        for (int i = list.size()-1; i >= 0 ; i--) {
            temp.data = list.get(i);
            temp = temp.next;
        }
        return head;
    }


    public Node reverse2(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node curr = head;
        Node pre = null;
        Node fut = null;
        while(curr != null){
            fut = curr.next;
            curr.next = pre;
            pre = curr;
            curr = fut;
        }
        head = pre;
        return head;
    }
}

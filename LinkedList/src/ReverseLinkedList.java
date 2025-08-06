import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {


    public Node reverse(Node head){
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
}

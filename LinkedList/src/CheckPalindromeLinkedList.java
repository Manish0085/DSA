import java.util.ArrayList;
import java.util.List;

public class CheckPalindromeLinkedList {


    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null){
            list.add(temp.data);
            temp = temp.next;
        }

        int start = 0;
        int end = list.size()-1;
        while (start < end){
            if (list.get(start) != list.get(end))
                return false;
        }

        return true;
    }
}

import java.util.HashSet;
import java.util.Set;

public class RemoveDupFromUnSortedLL {

    public ListNode removeDuplicates(ListNode head) {
        // code here
        if(head == null || head.next == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        ListNode temp = head;
        ListNode prev = null;
        while (temp != null) {
            if (set.contains(temp.val)) {
                prev.next = temp.next;
            } else {
                set.add(temp.val);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}

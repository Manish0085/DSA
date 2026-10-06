import java.util.List;

public class ReverseNodesIKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length < k)
            return head;

        temp = head;
        ListNode prev = null;
        for (int i = 1; i < k; i++) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        ListNode reverseListHead = reverseKGroup(temp, k);
        head.next = reverseListHead;
        return prev;

    }
}

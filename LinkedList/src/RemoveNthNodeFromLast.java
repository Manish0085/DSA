import java.util.List;

public class RemoveNthNodeFromLast
{

    public ListNode removeNthFromEnd(ListNode A, int B) {
        if (A == null)
            return A;
        int size = findLength(A);
        if(B >= size)
            return A.next;

        ListNode fast = A;
        ListNode slow = A;
        for (int i = 0; i < B; i++) {
            fast = fast.next;
        }
        ListNode prev = null;
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if(prev.next != null)
            prev.next = prev.next.next;

        return A;
    }

    public int findLength(ListNode node) {

        ListNode temp = node;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }
}



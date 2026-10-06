import java.lang.management.ThreadInfo;

public class MergeSort {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode middle  = middle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return merge(leftHead, rightHead);
    }

    private ListNode middle(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;

        while (left != null && right != null) {
            if (left.val < right.val) {
                dummy.next = left;
                left = left.next;
            } else {
                dummy.next = right;
                right = right.next;
            }
            dummy = dummy.next;
        }

        while (left != null) {
            dummy.next = left;
            left = left.next;
            dummy = dummy.next;
        }

        while (right != null) {
            dummy.next = right;
            right = right.next;
            dummy = dummy.next;
        }
        return p.next;
    }
}

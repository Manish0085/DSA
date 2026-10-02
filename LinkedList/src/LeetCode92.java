import org.w3c.dom.ls.LSInput;

import java.util.List;

public class LeetCode92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right)
            return head;

        ListNode prev = null;
        ListNode leftN = head;
        for (int i = 1; i < left; i++) {
            prev = leftN;
            leftN = leftN.next;
        }

        ListNode rightN = leftN;
        for (int i = left; i < right; i++) {
            rightN = rightN.next;
        }

        ListNode rightNodeNext = rightN.next;
        rightN.next = null;
        ListNode reverseNode = reverse(leftN);
        leftN.next = rightNodeNext;
        if (prev == null)
            return reverseNode;
        prev.next = reverseNode;
        return head;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverse(head.next);
        ListNode nextNode = head.next;
        nextNode.next = head;
        head.next = null;
        return newHead;
    }
}

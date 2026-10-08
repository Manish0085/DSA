import java.util.List;

public class DoubleANumberRepresentedLinkedList {

    public ListNode doubleIt(ListNode head) {
        if (head == null)
            return head;

        head = reverse(head);
        ListNode temp = head;
        int carry = 0;
        ListNode prev = null;
        while (temp != null) {
            int val = (temp.val * 2) + carry;
            temp.val = val % 10;
            carry = val / 10;
            prev = temp;
            temp = temp.next;
        }

        if(carry != 0)
            prev.next = new ListNode(carry);
        return reverse(head);
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}

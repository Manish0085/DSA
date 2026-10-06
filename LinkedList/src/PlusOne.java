import java.util.List;

public class PlusOne {

    public ListNode addOne(ListNode head) {
        int carry = 1;
        head = reverse(head);
        ListNode temp = head;
        while (temp != null) {
            if (temp.val == 9) {
                temp.val = 0;
                temp = temp.next;
            } else {
                temp.val++;
                carry = 0;
                break;
            }
        }

        head = reverse(head);
        if(carry == 1) {
            ListNode newHead = new ListNode(1);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}

import javax.swing.plaf.ListUI;

public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);

        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = new ListNode(-1);
        int carry = 0;
        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }
            dummy.next = new ListNode(sum % 10);
            carry = sum / 10;
            dummy = dummy.next;
        }

        return reverse(temp.next);
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverse(head.next);
        ListNode nextNode = head.next;
        nextNode.next = head;
        head.next = null;
        return newHead;
    }
}

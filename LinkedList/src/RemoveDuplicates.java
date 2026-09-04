public class RemoveDuplicates
{

    public ListNode deleteDuplicates(ListNode A) {
        if (A == null || A.next == null)
            return A;

        ListNode curr = A;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (curr != null && curr.next != null) {
            if (curr.val != curr.next.val) {
                dummy.next = curr;
                dummy = dummy.next;
            }
            curr = curr.next;
        }

        dummy.next = curr;

        return temp.next;
    }
}

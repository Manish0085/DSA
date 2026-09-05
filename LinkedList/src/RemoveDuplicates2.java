public class RemoveDuplicates2 {

    public ListNode deleteDuplicates(ListNode A) {
        if (A == null || A.next == null)
            return A;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode curr = A;
        while (curr != null && curr.next != null) {
            if (curr.val != curr.next.val) {
                dummy.next = curr;
                dummy = dummy.next;
            }
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;
            }
            curr = curr.next;
        }

        dummy.next = curr.next;
        return temp.next;
    }
}

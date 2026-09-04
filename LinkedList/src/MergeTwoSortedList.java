public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = A;
        ListNode t2 = B;

        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                dummy.next = t1;
                t1 = t1.next;
            } else {
                dummy.next = t2;
                t2 = t2.next;
            }
            dummy = dummy.next;
        }

        while (t1 != null) {
            dummy.next = t1;
            t1 = t1.next;
            dummy = dummy.next;
        }

        while (t2 != null) {
            dummy.next = t2;
            t2 = t2.next;
            dummy = dummy.next;
        }
        return temp.next;
    }
}

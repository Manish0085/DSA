public class PartitionList {

    public ListNode partition(ListNode A, int B) {
        ListNode d1 = new ListNode(-1);
        ListNode dummy1 = d1;
        ListNode t1 = d1;

        ListNode d2 = new ListNode(-1);
        ListNode dummy2 = d2;
        ListNode t2 = d2;

        ListNode temp = A;
        while (temp != null) {
            if (temp.val < B) {
                d1.next = temp;
                d1 = d1.next;
            } else {
                d2.next = temp;
                d2 = d2.next;
            }
            temp = temp.next;
        }

        d1.next = dummy2.next;
        if (d2.next != null)
            d2.next = null;

        return dummy1.next;
    }
}

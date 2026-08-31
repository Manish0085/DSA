public class SwapNodeInPair {

    public ListNode swap(ListNode node) {
        if(node == null || node.next == null)
            return null;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode t1 = node;
        ListNode t2 = node.next;

        while (t1 != null && t2 != null) {
            dummy.next = t2;
            t1.next = t2.next;
            t2.next = t1;

            dummy = t1;
            t1 = t1.next;
            if (t1 != null)
                t2 = t1.next;
        }

        return temp.next;
    }
}

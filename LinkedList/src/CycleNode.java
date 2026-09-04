public class CycleNode {

    public ListNode detectCycle(ListNode a) {

        ListNode node = findCycle(a);
        if(node == null)
            return node;

        ListNode slow = a;
        ListNode fast = node;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    private ListNode findCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return slow;
        }
        return null;
    }
}

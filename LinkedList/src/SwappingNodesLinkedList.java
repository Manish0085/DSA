public class SwappingNodesLinkedList {

    public ListNode swapNodes(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        ListNode fast = head;
        ListNode slow = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode temp = fast;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        int val = temp.val;
        temp.val = slow.val;
        slow.val = val;
        return head;
    }
}

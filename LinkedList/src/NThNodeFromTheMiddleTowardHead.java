public class NThNodeFromTheMiddleTowardHead {

    public int solve(ListNode A, int B) {
        ListNode middle = findMid(A);
        ListNode slow = A;
        ListNode fast = A;

        for (int i = 0; i < B; i++) {
            if (fast == middle)
                return -1;
            fast = fast.next;
        }

        if(fast == null)
            return -1;

        while (fast.next != middle) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.val;
    }

    private ListNode findMid(ListNode node) {
        ListNode slow = node;
        ListNode fast = node;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }


}

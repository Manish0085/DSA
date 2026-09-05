public class RotateList {

    public ListNode rotateRight(ListNode A, int B) {
        if (A == null || A.next == null)
            return A;

        int size = findSize(A);
        B = B % size;
        if (B == 0)
            return A;
        ListNode slow = A;
        ListNode fast = A;
        ListNode prev = null;

        for (int i = 1; i < B; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
        fast.next = A;
        return slow;
    }

    private int findSize(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }
}

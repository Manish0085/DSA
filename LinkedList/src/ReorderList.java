public class ReorderList {

    public ListNode reorderList(ListNode A) {
        if(A == null || A.next == null)
            return A;

        ListNode slow = A;
        ListNode fast = A;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = slow.next;
        slow.next = null;


        ListNode firstHalf = A;
        secondHalf = reverse(secondHalf);


        while (secondHalf != null) {
            ListNode firstNext = firstHalf.next;
            ListNode secondNext = secondHalf.next;

            firstHalf.next = secondHalf;
            secondHalf.next = firstNext;

            firstHalf = firstNext;
            secondHalf = secondNext;
        }

        return A;
    }


    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}

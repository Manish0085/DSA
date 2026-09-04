public class PalinDromeLinkedList {

    public int lPalin(ListNode A) {
        if (A  == null || A.next == null)
            return 1;
        ListNode slow = A;
        ListNode fast = A;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null)
            slow = slow.next;

        ListNode secondHalf = reverse(slow);
        ListNode firstHalf = A;


        while (secondHalf != null) {
            if(firstHalf.val != secondHalf.val)
                return 0;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return 1;
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

}

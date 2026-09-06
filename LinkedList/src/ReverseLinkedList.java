public class ReverseLinkedList {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        if (A == null || A.next == null)
            return A;

        ListNode prev1 = null;
        ListNode temp = A;
        for (int i = 1; i < B; i++) {
            prev1 = temp;
            temp = temp.next;
        }

        ListNode nodeB = temp;
        ListNode nodeC = null;
        for (int i = B; i <= C ; i++) {
            nodeC = temp;
            temp = temp.next;
        }
        nodeC.next = null;
        ListNode reversedHead = reverse(nodeB);
        if (B != 1) {
            prev1.next = reversedHead;
        } else {
            A = reversedHead;
        }

        nodeB.next = temp;
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

//    Given 1->2->3->4->5->NULL, m = 2 and n = 4,
}

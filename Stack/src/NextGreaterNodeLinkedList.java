import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class NextGreaterNodeLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        head = reverse(head);
        int[] ans = new int[len];
        temp = head;
        int i = len;
        while (temp != null) {
            while (!stack.isEmpty() && stack.peek() < temp.val) {
                stack.pop();
            }
            ans[--i] = stack.peek();
            stack.push(temp.val);
            temp = temp.next;
        }

        for (int j = 0; j < len; j++) {
            if (ans[j] == Integer.MAX_VALUE)
                ans[j] = 0;
        }
        return ans;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;

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

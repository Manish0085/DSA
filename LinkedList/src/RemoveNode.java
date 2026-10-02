public class RemoveNode {

    public void removeNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

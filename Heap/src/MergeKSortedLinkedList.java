import java.util.PriorityQueue;

class LLNode{
    int data;
    LLNode next;
    public LLNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class MergeKSortedLinkedList {


    LLNode mergeKLists1(LLNode[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (LLNode LLNode: arr){
            LLNode temp = LLNode;
            while (temp != null){
                pq.offer(temp.data);
                temp = temp.next;
            }
        }

        LLNode root = new LLNode(pq.poll());
        LLNode LLNode = root;
        while (!pq.isEmpty()){
            LLNode.next = new LLNode(pq.poll());
            LLNode = LLNode.next;
        }
        return root;
    }


    LLNode mergeKLists2(LLNode[] arr) {
        PriorityQueue<LLNode> pq = new PriorityQueue<>((a, b) -> a.data - b.data);

        for (LLNode node: arr){
            if(node != null) {
                pq.add(node);
            }
        }

        LLNode head = new LLNode(0);
        LLNode tail = head;
        while (!pq.isEmpty()){
            LLNode node = pq.poll();
            tail.next = node;
            tail = tail.next;
            if(node.next != null){
                pq.offer(node.next);
            }
        }
        return head.next;
    }

}

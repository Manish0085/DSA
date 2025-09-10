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


    LLNode mergeKLists(LLNode[] arr) {
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
}

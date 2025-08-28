import java.util.ArrayList;
import java.util.List;

class LNode{
    int data;
    LNode next;

    public LNode(int data){
        this.data = data;
        this.next = null;
    }
}
public class SortedLLToBST {

    public Node sortedListToBST(LNode head){
        List<Integer> list = new ArrayList<>();
        while (head != null){
            list.add(head.data);
            head = head.next;
        }

        return BST(list, 0, list.size()-1);

    }


    public Node BST(List<Integer> list, int start, int end){
        if (start > end)
            return null;

        int mid = start + (end - start + 1)/2;
        Node root = new Node(list.get(mid));
        root.left = BST(list, start, mid-1);
        root.right = BST(list, mid+1, end);
        return root;
    }
}

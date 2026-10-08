import java.util.ArrayList;
import java.util.List;

class  TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
public class ConvertSortedListToBST {

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        return bst(list, 0, list.size()-1);
    }

    public TreeNode bst(List<Integer> list, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end)/2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = bst(list, start, mid-1);
        root.right = bst(list, mid+1, end);
        return root;
    }


//    public TreeNode sortedListToBST2(ListNode head) {
//        ListNode curr = head;
//        int n = 0;
//        while (curr != null) {
//            n++;
//            curr = curr.next;
//        }
//        return bst2(0, n-1);
//    }

//    public TreeNode bst2(int start, int end) {
//        if (start > end)
//            return null;
//        int mid = (start + end)/2;
//
//
//        return root;
//    }
}

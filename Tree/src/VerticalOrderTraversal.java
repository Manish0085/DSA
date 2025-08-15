import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class VerticalOrderTraversal {

    int l;
    int r;
    public List<Integer> verticalTraversal(Node root){
        find(root, 0);

        List<List<Integer>> positive = new ArrayList<>();
        List<List<Integer>> negative = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            positive.add(new ArrayList<>());
        }

        for (int i = 0; i < Math.abs(l); i++) {
            negative.add(new ArrayList<>());
        }
        Queue<Node> que = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();
        que.add(root);
        index.add(0);
        while(!que.isEmpty()){
            Node temp = que.remove();
            int pos = index.remove();
            if (pos >= 0)
                positive.get(pos).add(temp.data);
            else
                negative.get(Math.abs(pos)).add(temp.data);
            if (temp.left != null){
                que.add(temp.left);
                index.add(pos-1);
            }
            if (temp.right != null){
                que.add(temp.right);
                index.add(pos+1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = negative.size()-1; i >= 0; i--) {
            ans.addAll(negative.get(i));
        }

        for (int i = 0; i < positive.size(); i++) {
            ans.addAll(positive.get(i));
        }

        return ans;
    }


    private void find(Node root, int pos){
        if (root == null)
            return;

        l = Math.min(pos, l);
        r = Math.max(pos, l);

        find(root.left, pos-1);
        find(root.right, pos+1);
    }
}

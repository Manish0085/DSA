import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DiagonalTraversal {

    int left;

    private void find(Node root, int pos){
        if(root == null){
            return;
        }

        left = Math.max(pos, left);
        find(root.left, pos+1);
        find(root.right, pos);
    }

    // T.C:- O(n)
    // S.C:- O(n)
    public List<Integer>  diagonalTraversal(Node root){
        this.left = 0;
        List<List<Integer>> ans = new ArrayList<>();

        find(root, 0);
        for (int i = 0; i < left+1; i++) {
            ans.add(new ArrayList<>());
        }
        List<Integer> list = new ArrayList<>();

        findDiagonal(root, 0, ans);
        for (int i = 0; i < ans.size(); i++) {
            list.addAll(ans.get(i));
        }
        return list;
    }

    private void findDiagonal(Node root, int pos, List<List<Integer>> ans){

        if (root == null)
            return;
        ans.get(pos).add(root.data);
        findDiagonal(root.left, pos+1, ans);
        findDiagonal(root.right, pos, ans);
    }
}

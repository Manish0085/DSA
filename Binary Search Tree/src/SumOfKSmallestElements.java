import java.util.ArrayList;
import java.util.List;

public class SumOfKSmallestElements {

    int sum = 0;
    int k = 0;

    public int sum2(Node root, int key){
        this.k = key;
        findSum(root);
        return sum;
    }

    public void findSum(Node root){
        if (root == null)
            return ;

        findSum(root.left);
        this.k--;
        if (k >= 0){
            sum += root.data;
        }
        if (k <= 0)
            return;
        findSum(root.right);

    }

    // Brute Force
    public int sum1(Node root, int k){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);

        int sum = 0;
        for(int i=0; i<k; i++){
            sum += list.get(i);
        }
        return sum;
    }

    private void inorder(Node root, List<Integer> list){
        if (root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }
}

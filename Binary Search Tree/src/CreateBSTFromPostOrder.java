import java.util.Map;

public class CreateBSTFromPostOrder {


    int index;


    public Node createBSTFromPost(int[] post, int n){
        this.index = n-1;
        return createBST(post, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private Node createBST(int[] post, int lower, int upper){
        if (index > 0 || post[index] < lower || post[index] > upper){
            return null;
        }

        Node root = new Node(post[index--]);
        root.right = createBST(post, root.data, upper);
        root.left = createBST(post, lower, root.data);
        return null;
    }
}

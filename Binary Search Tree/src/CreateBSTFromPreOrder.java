import java.util.List;

public class CreateBSTFromPreOrder {


    int index = 0;

    public Node craeteBST(List<Integer> preOrder, int lower, int upper){

        if (index == preOrder.size() || preOrder.get(index) < lower || preOrder.get(index) > upper){
            return null;
        }


        Node root = new Node(preOrder.get(index++));
        root.left = craeteBST(preOrder, lower, root.data);
        root.right = craeteBST(preOrder, root.data, upper);
        return root;
    }
}

import java.util.List;

public class PrintBSTElementsInGivenRange {

    public void find(Node root, List<Integer> list, int n1, int n2){
        if (root == null)
            return;

        if (root.data > n1 && root.data > n2)
            find(root.left, list, n1, n2);
        else if (root.data < n1 && root.data < n2)
            find(root.right, list, n1, n2);
        else {
            find(root.left, list, n1, n2);
            list.add(root.data);
            find(root.right, list, n1, n2);
        }
    }
}



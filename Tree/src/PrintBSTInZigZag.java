import java.util.*;

public class PrintBSTInZigZag {

    public List<Integer> print(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);

        while (!s1.isEmpty() && !s2.isEmpty()){
            while (!s1.isEmpty()){
                Node temp = s1.pop();
                list.add(temp.data);
                if (temp.right != null)
                    s2.push(temp.right);
                if (temp.left != null)
                    s2.push(temp.left);
            }
            while (!s2.isEmpty()){
                Node temp = s2.pop();
                list.add(temp.data);
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
        }
        return list;
    }
}

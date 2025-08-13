import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    public List<Integer> inorder(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Stack<Node> stack = new Stack<>();
        Stack<Boolean> visited = new Stack<>();
        stack.push(root);
        visited.push(false);
        while (!stack.isEmpty()){
            Node temp = stack.pop();
            boolean flag = visited.pop();
            if (!flag){
                if (temp.right != null){
                    stack.push(temp.right);
                    visited.push(false);
                }
                stack.push(temp);
                visited.push(true);
                if (temp.left != null){
                    stack.push(temp.left);
                    visited.push(false);
                }
            }
            else {
                list.add(temp.data);
            }
        }
        return list;
     }
}

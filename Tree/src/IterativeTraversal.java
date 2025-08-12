import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeTraversal {


    public List<Integer> preOrder(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node temp = stack.pop();
            list.add(temp.data);
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
            }

        }
        return list;
    }

    public List<Integer> inOrder(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return null;
        Stack<Node> stack = new Stack<>();
        Node temp = root;
        while (true){
            if (root != null){
                stack.push(temp);
                temp = temp.left;
            } else {
                if (!stack.isEmpty())
                    break;
                temp = stack.pop();
                list.add(temp.data);
                temp = temp.right;
            }
        }
        return list;
    }

    public List<Integer> postOrderUsingTwoStack(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return null;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack2.isEmpty()){
            Node temp = stack1.pop();
            stack2.push(temp);
            if (temp.left != null){
                stack1.push(temp.left);
            }
            if (temp.right != null){
                stack1.push(temp.right);
            }
            while (!stack2.isEmpty()){
                list.add(temp.data);
                stack2.pop();
            }
        }
        return list;
    }
}

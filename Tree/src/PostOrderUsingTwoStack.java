import com.sun.security.auth.NTSidPrimaryGroupPrincipal;

import javax.swing.*;
import java.util.*;

public class PostOrderUsingTwoStack {

    public List<Integer> postOrder(Node root){
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        Stack<Node> ans = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node temp = stack.pop();
            ans.push(temp);
            if (temp.left != null)
                stack.push(temp.left);
            if (temp.right != null)
                ans.push(temp.right);
        }

        while (!ans.isEmpty()){
            list.add(ans.pop().data);
        }
        return list;
    }
}

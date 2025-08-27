import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindCommonNodesInTwoBSTs {

    
    public List<Integer> findCommon(Node root1, Node root2){
        List<Integer> ans = new ArrayList<>();
        Stack<Node> s1 = new Stack();
        Stack<Node> s2 = new Stack();
        while (root1 != null){
            s1.push(root1);
            root1 = root1.left;
        }

        while (root2 != null){
            s1.push(root2);
            root2 = root2.left;
        }
        
        while (!s1.isEmpty() && !s2.isEmpty()){
            if (s1.peek().data == s2.peek().data){
                ans.add(s1.peek().data);
                root1 = s1.pop().right;
                root2 = s2.pop().right;
            } else if (s1.peek().data > s2.peek().data) {
                root2 = s2.pop().right;
            } else {
                root1 = s1.pop().right;
            }


            while (root1 != null){
                s1.push(root1);
                root1 = root1.left;
            }

            while (root2 != null){
                s1.push(root2);
                root2 = root2.left;
            }
        }

        return ans;
    }
}

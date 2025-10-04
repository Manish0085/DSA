import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTrees {

    public boolean recursion(Node r1, Node r2){
        if (r1 == null && r2 == null)
            return true;
        if (r1 == null || r2 == null)
            return false;

        return (r1.data == r2.data) &&
                recursion(r1.left, r2.left) &&
                recursion(r1.right, r2.right);
    }


    public boolean iterative(Node r1, Node r2){
        if(r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null){
            return false;
        }
        Queue<Node> q1 = new LinkedList<>();
        Queue<Node> q2 = new LinkedList<>();
        q1.add(r1);
        q2.add(r2);
        while (!q1.isEmpty() && !q2.isEmpty()){
            Node temp1 = q1.poll();
            Node temp2 = q2.poll();

            if (temp1.data != temp2.data){
                return false;
            }

            if (temp1.left != null && temp2.left != null){
                q1.add(temp1.left);
                q2.add(temp2.left);
            }else if (temp1.left != null || temp2.left != null){
                return false;
            }

            if (temp1.right != null && temp2.right != null){
                q1.add(temp1.right);
                q2.add(temp2.right);
            }else if (temp1.right != null || temp2.right != null){
                return false;
            }
        }
        return true;
    }




}

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;

public class CreateTree {

    public Node create(){
        Queue<Node> que = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root value: ");
        int data = sc.nextInt();
        Node root = new Node(data);
        que.add(root);
        while (!que.isEmpty()){
            Node temp = que.remove();
            System.out.print("Enter the left child of "+temp.data+": ");
            int left = sc.nextInt();
            if(left != -1){
                temp.left = new Node(left);
                que.add(temp.left);
            }
            System.out.print("Enter the right child of "+temp.data+": ");
            int right = sc.nextInt();
            if(right != -1){
                temp.right = new Node(right);
                que.add(temp.right);
            }
        }
        return root;
    }

    public void preOrderRecursive(Node root){
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }
    public void inOrderRecursive(Node root){
        if (root == null)
            return;
        inOrderRecursive(root.left);
        System.out.print(root.data+" ");
        inOrderRecursive(root.right);
    }
    public void postOrderRecursive(Node root){
        if (root == null)
            return;
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data+" ");
    }

    public List<Integer> preOrderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node temp = stack.pop();
            ans.add(temp.data);
            if (temp.right != null)
                stack.push(temp.right);
            if (temp.left != null)
                stack.push(temp.left);
        }
        return ans;
    }


    public List<Integer> inOrderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Stack<Node> stack = new Stack<>();
        Stack<Integer> visited = new Stack<>();
        stack.push(root);
        visited.push(0);
        while (!stack.isEmpty()){
            Node temp = stack.pop();
            int value = visited.pop();
            if (value == 1){
                ans.add(temp.data);
            } else {
                if (temp.right != null){
                    stack.push(temp.right);
                    visited.push(0);
                }
                stack.push(temp);
                visited.push(1);
                if (temp.left != null){
                    stack.push(temp.left);
                    visited.push(0);
                }
            }
        }
        return ans;
    }

    public List<Integer> postOrderIterative(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node temp = stack.pop();
            ans.add(temp.data);
            if (temp.left != null)
                stack.push(temp.left);
            if (temp.right != null)
                stack.add(temp.right);
        }

        Collections.reverse(ans);
        return ans;
    }

    public List<Integer> levelOrder(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (!que.isEmpty()){
            int size = que.size();
            for (int i = 0; i < size; i++) {
                Node temp = que.remove();
                ans.add(temp.data);
                if (temp.left != null)
                    que.add(temp.left);
                if (temp.right != null)
                    que.add(temp.right);
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        CreateTree obj = new CreateTree();
        Node root = obj.create();
        System.out.println("PreOrder Traversal: ");
        obj.preOrderRecursive(root);
        System.out.println("\n"+obj.preOrderIterative(root));
        System.out.println("\nInOrder Traversal: ");
        obj.inOrderRecursive(root);
        System.out.println("\n"+obj.inOrderIterative(root));
        System.out.println("\nPostOrder Traversal: ");
        obj.postOrderRecursive(root);
        System.out.println("\n"+obj.postOrderIterative(root));


    }
}

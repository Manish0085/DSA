import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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



    public static void main(String[] args) {
        CreateTree obj = new CreateTree();
        Node root = obj.create();
        System.out.println("PreOrder Traversal: ");
        obj.preOrderRecursive(root);
        System.out.println("\nInOrder Traversal: ");
        obj.inOrderRecursive(root);
        System.out.println("\nPostOrder Traversal: ");
        obj.postOrderRecursive(root);

    }
}

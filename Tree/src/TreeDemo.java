import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TreeDemo {

    public void createTree() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the root node value: ");
        int rootVal = in.nextInt();
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(rootVal);
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.print("Enter the left child of " + temp.data + ": ");
            int leftNodeVal = in.nextInt();
            if (leftNodeVal != -1) {
                temp.left = new Node(leftNodeVal);
                queue.add(temp.left);
            }
            System.out.print("Enter the right child  of " + temp.data + ": ");
            int rightNodeVal = in.nextInt();
            if (rightNodeVal != -1) {
                temp.right = new Node(rightNodeVal);
                queue.add(temp.right);
            }
        }
    }


    public Node binaryTree() {
        Scanner in = new Scanner(System.in);
        int val = in.nextInt();
        if (val == -1)
            return null;
        Node temp = new Node(val);
        // create left side
        System.out.print("Enter the left child of " + val + ": ");
        temp.left = binaryTree();
        // create right side
        System.out.print("Enter the right child of " + val + ": ");
        temp.right = binaryTree();
        return temp;
    }


    public void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        // Node
        System.out.print(root.data + " --> ");
        // Left
        preOrderTraversal(root.left);
        // Right
        preOrderTraversal(root.right);
    }




    public static void main(String[] args) {
        TreeDemo obj = new TreeDemo();
        System.out.print("Enter the root node value: ");
        Node root = obj.binaryTree();
        // Tree creation

        // Pre-Order Traversal
        System.out.print("Pre-Order:- ");
        obj.preOrderTraversal(root);
        // In-Order Traversal

    }
}


/*
            Enter the root node value: 1
            Enter the left child of 1: 2
            Enter the left child of 2: 3
            Enter the left child of 3: 4
            Enter the left child of 4: -1
            Enter the right child of 4: -1
            Enter the right child of 3: 5
            Enter the left child of 5: -1
            Enter the right child of 5: -1
            Enter the right child of 2: 6
            Enter the left child of 6: -1
            Enter the right child of 6: -1
            Enter the right child of 1: 7
            Enter the left child of 7: -1
            Enter the right child of 7: 8
            Enter the left child of 8: 9
            Enter the left child of 9: -1
            Enter the right child of 9: -1
            Enter the right child of 8: 10
            Enter the left child of 10: -1
            Enter the right child of 10: -1


                              1
                            /   \
                           2     7
                         /  \      \
                        3    6      8
                       / \         / \
                      4   5       9  10

 */

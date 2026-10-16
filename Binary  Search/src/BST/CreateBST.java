package BST;

import java.util.Scanner;

public class CreateBST {

    public static void  takeInput(Node root) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int data = sc.nextInt();
        while (data != -1) {
            insertInBST(root, data);
            data = sc.nextInt();
        }
    }

    private static Node insertInBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data > root.data) {
            root.right = insertInBST(root.right, data);
        }else {
            root.left = insertInBST(root.left, data);
        }
        return root;
    }


    public static void main(String[] args) {
        Node root = null;
        takeInput(root);
    }
}

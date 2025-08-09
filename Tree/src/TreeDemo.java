import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TreeDemo {

    public void createTree(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the root node value: ");
        int rootVal = in.nextInt();
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(rootVal);
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print("Enter the left child of "+temp.data+": ");
            int leftNodeVal = in.nextInt();
            if (leftNodeVal != -1){
                temp.left = new Node(leftNodeVal);
                queue.add(temp.left);
            }
            System.out.print("Enter the right child  of "+temp.data+": ");
            int rightNodeVal = in.nextInt();
            if (rightNodeVal != -1){
                temp.right = new Node(rightNodeVal);
                queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeDemo obj = new TreeDemo();
        obj.createTree();
    }
}

import java.util.ArrayList;
import java.util.List;

public class BoundaryTraversal {

      public List<Integer> boundary(Node root){


          List<Integer> list = new ArrayList<>();


          // root
          list.add(root.data);
          if (root.left == null && root.right == null){
              return list;
          }

          // Traverse Left subtree except leaf node
          leftSub(root.left, list);

          // Traverse Leaf leaf nodes
          leaf(root, list);

          // Traverse right subtree in reverse order except leaf node
          rightSub(root.right, list);

          return list;

      }

      public void leaf(Node root, List<Integer> list){

          if (root == null)
              return;

          if (root.left == null && root.right == null) {
              list.add(root.data);
              return;

          }

          leaf(root.left, list);
          leaf(root.right, list);

      }

      public void leftSub(Node root, List<Integer> list){

          if (root == null || (root.left == null && root.right != null))
              return;


          list.add(root.data);
          if (root.left != null)
              leftSub(root.left, list);
          else
              leftSub(root.right, list);

      }

      public void rightSub(Node root, List<Integer> ans){
          if (root == null || (root.left != null && root.right != null)){
              return;
          }

          if (root.right != null)
              rightSub(root.right, ans);
          else
              rightSub(root.left, ans);

          ans.add(root.data);
      }
}

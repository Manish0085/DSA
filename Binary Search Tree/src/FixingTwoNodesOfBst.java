public class FixingTwoNodesOfBst {


    public void correctBST(Node root) {

         Node curr = null;
         Node first = null, second = null;
         Node last = null, present = null;

         while (root != null){
             if (root.left == null){
                 last = present;
                 present = root;
                 if (last != null && last.data > present.data){
                     if (first == null)
                         first = last;
                     second = present;
                 }
                 root = root.right;
             }
             else {
                 root = root.left;
                 while (curr.right != null && curr.right != root){
                     curr = curr.right;
                 }
                 if (curr.right == null){
                     curr.right = root;
                     root = root.left;
                 }
                 else {
                     curr.right = null;
                     last = present;
                     present = root;
                     if (last != null && last.data > present.data){
                         if (first == null)
                             first = last;
                         second = present;
                     }
                     root = root.right;
                 }
             }


         }

         int num = first.data;
         first.data = second.data;
        second.data = num;
    }
}

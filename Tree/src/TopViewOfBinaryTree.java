import com.sun.source.tree.ArrayAccessTree;

import java.lang.reflect.Array;
import java.util.*;

public class TopViewOfBinaryTree {

       int l = 0;
       int r = 0;

       public int[] tView(Node root){

              if (root == null)
                     return new int[0];
              // considering that both left and right are at the 0 (root) initially.
              find(root, 0);
              int[] ans = new int[r-l+1];
              boolean[] filled = new boolean[r-l+1];
              Queue<Node> que = new LinkedList<>();
              Queue<Integer> index = new LinkedList<>();
              que.add(root);
              index.add(-1 * l);
              while (!que.isEmpty()){
                     Node temp = que.remove();
                     int pos = index.remove();
                     if (!filled[pos]){
                            filled[pos] = true;
                            ans[pos] = temp.data;
                     }
                     if (temp.left != null){
                            que.add(temp.left);
                            index.add(pos-1);
                     }
                     if (temp.right != null){
                            que.add(temp.right);
                            index.add(pos+1);
                     }
              }

              return ans;
       }


       private void find(Node root, int pos){
              if (root == null)
                     return;
              l = Math.min(l, pos);
              r = Math.max(r, pos);

              find(root.left, pos-1);
              find(root.right, pos+1);

       }
}

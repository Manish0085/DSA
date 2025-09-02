public class IsIdentical {


    public boolean isSameTree(Node r1, Node r2){
        if (r1 == null && r2 == null)
            return true;

        if((r1 != null && r2 == null) && (r1 == null && r2 != null))
            return false;

        if (r1.data != r2.data)
            return false;

        return isSameTree(r1.left, r2.left) && isSameTree(r1.right, r2.right);
    }
}

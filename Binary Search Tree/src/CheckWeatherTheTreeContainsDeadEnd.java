public class CheckWeatherTheTreeContainsDeadEnd {

    public boolean checkDeadEnd(Node root, int lower, int upper){
        if (root == null)
            return false;

        if (root.left == null && root.right == null){
            if (root.data - lower == 1 && upper - root.data == 1)
                return true;
            else
                return false;
        }

        return checkDeadEnd(root.left, lower, root.data) || checkDeadEnd(root.right, root.data, upper);
    }
}

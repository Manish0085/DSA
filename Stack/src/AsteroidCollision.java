import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid: asteroids) {
            boolean flag = false;

            while (!stack.isEmpty() &&
                    stack.peek() > 0 &&
                    asteroid < 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                    flag = true;
                    break;
                } else {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                stack.push(asteroid);
            }
        }
        int[] ans = new int[stack.size()];
        int i=stack.size()-1;
        while (!stack.isEmpty()) {
            ans[i--] = stack.pop();
        }
        return ans;
    }
}

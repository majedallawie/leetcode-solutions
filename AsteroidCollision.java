import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < asteroids.length) {
            if (asteroids[i] > 0 || asteroids[i] < 0 && (stack.size() == 0 || stack.peek() < 0)) {
                stack.push(asteroids[i]);
                i++;
            }
            else if (asteroids[i] < 0 && stack.peek() > 0 && Math.abs(asteroids[i]) < stack.peek())
                i++;
            else if (asteroids[i] < 0 && stack.peek() > 0 && Math.abs(asteroids[i]) > stack.peek())
                stack.pop();
            else if (asteroids[i] < 0 && stack.peek() > 0 && Math.abs(asteroids[i]) == stack.peek()) {
                stack.pop();
                i++;
            }
        }
        int[] result = new int[stack.size()];
        for (i = result.length - 1; i >= 0; i--)
            result[i] = stack.pop();
        return result;
    }
}

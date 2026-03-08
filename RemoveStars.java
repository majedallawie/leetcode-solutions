
import java.util.Stack;

public class RemoveStars {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*')
                stack.push(s.charAt(i));
            else stack.pop();
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty())
            result.insert(0, stack.pop());
        return result.toString();
    }
}

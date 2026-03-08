
import java.util.Stack;

class ReverseWords {
    public static String reverseWords(String s) {
        Stack<String> words = new Stack<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            // System.out.println("[" + temp + "]");
            // System.out.println(words.size());
            // System.out.println(i + "\n");

            if (s.charAt(i) == ' ' && !temp.isEmpty()) {
                words.push(temp.toString());
                temp.delete(0, temp.length());
            }
            else if (s.charAt(i) != ' ')
                temp.append(s.charAt(i));
        }
        if (!temp.isEmpty()) {
            words.push(temp.toString());
            temp.delete(0, temp.length());
        }
        while (!words.isEmpty()) {
            temp.append(words.pop());
            if (!words.isEmpty())
                temp.append(" ");
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
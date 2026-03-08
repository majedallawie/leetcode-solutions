import java.util.Stack;
public class ReverseVowels {
    public boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        else return false;
    }
    public String reverseVowels(String s) {
        Stack<Character> vowels = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                vowels.add(s.charAt(i));
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i)))
                result += vowels.pop();
            else result += s.charAt(i);
        }
        return result;
    }
}

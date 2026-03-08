import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        if (!s.contains("["))
            return s;
        Stack<Integer> nums = new Stack<>();
        String result = "";
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (isNum(s.charAt(i))) {
                for (int j = i; isNum(s.charAt(j)); j++) {
                    temp += s.charAt(j);
                    i = j;
                }
                nums.push(Integer.parseInt(temp));
                temp = "";
            }
            else result += s.charAt(i);
        }
        int lastOpen = result.lastIndexOf('[');
        int firstClose = lastOpen + result.substring(lastOpen).indexOf(']');
        while (lastOpen >= 0 && firstClose >= 0) {
            temp = "";
            int repeats = nums.pop();
            for (int i = 0; i < repeats; i++)
                temp += result.substring(lastOpen + 1, firstClose);
            result = result.substring(0, lastOpen) + temp + result.substring(firstClose + 1);
            lastOpen = result.lastIndexOf('[');
            if (lastOpen >= 0)
                firstClose = lastOpen + result.substring(lastOpen).indexOf(']');
        }
        return result;
    }

    public boolean isNum(char c) {
        try {
            int i = Integer.parseInt(c + "");
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}

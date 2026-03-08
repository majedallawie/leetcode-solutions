public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length == 1)
            return 2;
        char curr = chars[0];
        int count = 1;
        String result = "";
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == curr)
                count++;
            else {
                result += curr;
                result += (count > 1) ? count : "";
                curr = chars[i];
                count = 1;
            }
        }
        result += curr;
        result += (count > 1) ? count : "";
        for (int i = 0; i < result.length(); i++)
            chars[i] = result.charAt(i);
        return result.length();
    }
}

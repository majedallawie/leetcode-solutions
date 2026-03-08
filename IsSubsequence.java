public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int p = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(p) && p < s.length() - 1)
                p++;
            else if (t.charAt(i) == s.charAt(p))
                return true;
        }
        return false;
    }
}

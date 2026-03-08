public class LongestZigzag {
    public int longestZigZag(TreeNode root) {
        if (root == null)
            return 0;
        int length = 0;
        boolean direction = false;
        TreeNode temp = root;
        while (temp != null) {
            if (!direction) {
                temp = temp.left;
                direction = true;
            } else {
                temp = temp.right;
                direction = false;
            }
            if (temp != null)
                length++;
        }
        temp = root;
        direction = true;
        int tempLength = 0;
        while (temp != null) {
            if (!direction) {
                temp = temp.left;
                direction = true;
            } else {
                temp = temp.right;
                direction = false;
            }
            if (temp != null)
                tempLength++;
            length = Math.max(tempLength, length);
        }
        return Math.max(length, Math.max(longestZigZag(root.left), longestZigZag(root.right)));
    }
}
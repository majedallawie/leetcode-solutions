public class DeleteTreeNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null || (root.left == null && root.right == null && key == root.val))
            return null;

        TreeNode del = root, delPrev = root;
        while (del != null) {
            if (key > del.val) {
                delPrev = del;
                del = del.right;
            }
            else if (key < del.val) {
                delPrev = del;
                del = del.left;
            } else break;
        }
        if (del == null)
            return root;

        TreeNode alt = del, prev = del;
        if (del.right != null) {
            alt = alt.right;
            while (alt.left != null) {
                prev = alt;
                alt = alt.left;
            }
            del.val = alt.val;
            if (prev == del)
                del.right = alt.right;
            else
                prev.left = alt.right;
        }
        else if (del.left != null) {
            alt = alt.left;
            while (alt.right != null) {
                prev = alt;
                alt = alt.right;
            }
            del.val = alt.val;
            if (prev == del)
                del.left = alt.left;
            else
                prev.right = alt.left;
        }
        else {
            if (key > delPrev.val)
                delPrev.right = null;
            else if (key < delPrev.val)
                delPrev.left = null;
        }
        return root;
    }
}

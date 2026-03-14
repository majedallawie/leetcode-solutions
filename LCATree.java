public class LCATree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (traversal(root.left, p, q) == 2)
                root = root.left;
            else if (traversal(root.right, p, q) == 2)
                root = root.right;
            else break;
        }
        return root;
    }

    public int traversal(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return 0;
        else if (root == p || root == q)
            return 1 + traversal(root.left, p, q) + traversal(root.right, p, q);
        else
            return traversal(root.left, p, q) + traversal(root.right, p, q);
    }
}

public class PathSum {
    public int pathSum(TreeNode root, int targetSum) {
        int result = traversal(root, targetSum, 0);
        return result + allPaths(root, targetSum);
    }

    public int allPaths(TreeNode root, int targetSum) {
        if (root == null)
            return 0;
        int result = traversal(root.left, targetSum, 0) + traversal(root.right, targetSum, 0);
        return result + allPaths(root.left, targetSum) + allPaths(root.right, targetSum);
    }

    public int traversal(TreeNode root, int targetSum, long sum) {
        if (root == null)
            return 0;
        sum += root.val;
        if (sum == targetSum)
            return 1 + traversal(root.left, targetSum, sum) + traversal(root.right, targetSum, sum);
        else
            return traversal(root.left, targetSum, sum) + traversal(root.right, targetSum, sum);
    }
}

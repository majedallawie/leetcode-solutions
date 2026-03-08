import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class LeafSimilarTrees {
    LinkedList<Integer> leafs1;
    LinkedList<Integer> leafs2;

    public LeafSimilarTrees() {
        leafs1 = new LinkedList<>();
        leafs2 = new LinkedList<>();
    }

    public int traverseTree(TreeNode root, int listNo) {
        if (root == null)
            return 0;
        else if (root.left == null && root.right == null) {
            if (listNo == 1)
                leafs1.add(root.val);
            else
                leafs2.add(root.val);
            return 0;
        }
        else
            return traverseTree(root.left, listNo) + traverseTree(root.right, listNo);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        int temp = traverseTree(root1, 1);
        temp = traverseTree(root2, 2);
        return leafs1.equals(leafs2);
    }
}
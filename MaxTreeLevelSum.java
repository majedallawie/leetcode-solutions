
import java.util.LinkedList;

public class MaxTreeLevelSum {
    private LinkedList<Integer> levels = new LinkedList<>();
    
    public int maxLevelSum(TreeNode root) {
        traversal(root, 0);
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < levels.size(); i++) {
            if (levels.get(i) > max) {
                max = levels.get(i);
                maxIndex = i;
            }
        }
        return maxIndex + 1;      
    }

    private int traversal(TreeNode root, int level) {
        if (root == null)
            return 0;
        if (levels.size() <= level)
            levels.add(0);
        levels.set(level, levels.get(level) + root.val);
        return traversal(root.left, level + 1) + traversal(root.right, level + 1);
    }
}

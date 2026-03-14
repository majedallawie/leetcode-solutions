import java.util.LinkedList;
import java.util.List;

public class RightSideViewTree {
    LinkedList<LinkedList<Integer>> levels = new LinkedList<>();

    public List<Integer> rightSideView(TreeNode root) {
        int x = traversal(root, 0);
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < levels.size(); i++)
            result.add(levels.get(i).getLast());
        return result;
    }
    
    public int traversal(TreeNode root, int level) {
        if (root == null)
            return 0;
        if (levels.size() <= level)
            levels.add(new LinkedList<>());
        levels.get(level).add(root.val);
        return traversal(root.left, level + 1) + traversal(root.right, level + 1);
    }
}
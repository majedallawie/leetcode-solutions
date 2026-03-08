import java.util.LinkedList;
import java.util.List;

public class FindDeference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new LinkedList<>();
        List<Integer> temp = new LinkedList<>();
        answer.add(new LinkedList<>());
        answer.add(new LinkedList<>());
        for (int i : nums2)
            temp.add(i);
        for (int i : nums1)
            if (!temp.contains(i) && !answer.get(0).contains(i))
                answer.get(0).add(i);
        temp.clear();
        for (int i : nums1)
            temp.add(i);
        for (int i : nums2)
            if (!temp.contains(i) && !answer.get(1).contains(i))
                answer.get(1).add(i);
        return answer;        
    }
}

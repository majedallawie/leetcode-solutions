import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        Set<Integer> set = new HashSet<>();
        set.addAll(map.values());

        return map.size() == set.size();
    }
}

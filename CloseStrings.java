import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (map1.containsKey(word1.charAt(i)))
                map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
            else
                map1.put(word1.charAt(i), 1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word2.length(); i++) {
            if (map2.containsKey(word2.charAt(i)))
                map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
            else
                map2.put(word2.charAt(i), 1);
        }
        ArrayList<Integer> values1 = new ArrayList<>();
        values1.addAll(map1.values());

        ArrayList<Integer> values2 = new ArrayList<>();
        values2.addAll(map2.values());

        Collections.sort(values1);
        Collections.sort(values2);
        
        return map1.keySet().equals(map2.keySet()) && values1.equals(values2);
    }
}

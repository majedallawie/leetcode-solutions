
import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public String intToRoman(int num) {
        Map<Character, Integer> romanMap = new HashMap<>();
        
        romanMap.put('M', 1000);
        romanMap.put('D', 500);
        romanMap.put('C', 100);
        romanMap.put('L', 50);
        romanMap.put('X', 10);
        romanMap.put('V', 5);
        romanMap.put('I', 1);

        Map<Character, Integer> counts = new HashMap<>();
        for (char key : romanMap.keySet()) {
            int temp = num / romanMap.get(key);
            counts.put(key, temp);
            num -= temp;
        }

        String result = "";
        for (char c : counts.keySet()) {
            for (int i = 0; i < counts.get(c); i++)
                result += c;
        }

        return result;
    }
}

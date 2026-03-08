import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        List<String> transactions = new ArrayList<>();
        transactions.add(  "1234567890123456 0015 date 100 majed");
        transactions.add(  "1234567890123456 0015 date 50 adnan alkam");
        transactions.add(  "1234567890123456 0012 date 100 bassam alboushi");
        transactions.add(  "1234567890123456 0009 date 100 soma");
        transactions.add(  "1234567890123456 1111 date 300 ali");
        transactions.add(  "1234567890123456 1221 date 300 hamza");

        Map<String, String> categories = new HashMap<>();
        categories.put("0012", "Home");
        categories.put("0013", "Super");
        categories.put("0014", "Hello");
        categories.put("00015", "Paper");
        categories.put("0009", "Black");
        categories.put("0008", "Gaming");
        categories.put("0000", "Unknown");

        List<String[]> afterEdit = new ArrayList<>();
        for (int i = 0; i < transactions.size(); i++) {
            afterEdit.add(transactions.get(i).split(" "));
            afterEdit.get(i)[0] = afterEdit.get(i)[0].substring(0, 4) + "********" + afterEdit.get(i)[0].substring(12, 16);
        }

        
    }
}
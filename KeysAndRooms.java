import java.util.ArrayList;
import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        ArrayList<Integer> keys = new ArrayList<>();
        keys.add(0);
        
        for (int i = 0, index; i < rooms.size(); i++) {
            try {
                index = keys.get(i);
            }
            catch(IndexOutOfBoundsException e) {
                break;
            }
            for (int j = 0; j < rooms.get(index).size(); j++) {
                if (!keys.contains(rooms.get(index).get(j)))
                    keys.add(rooms.get(index).get(j));
            }
        }

        return rooms.size() == keys.size();
    }
}

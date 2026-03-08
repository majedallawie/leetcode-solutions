import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private static Queue<Integer> recents;
    public RecentCounter() {
        recents = new LinkedList<>();
    }
    
    public int ping(int t) {
        recents.add(t);
        while(t - 3000 > recents.peek())
            recents.poll();
        return recents.size();
    }
}
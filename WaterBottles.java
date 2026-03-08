import java.util.ArrayList;
import java.util.List;

class WaterBottles {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int i = 0; i < candies.length; i++)
            max = Math.max(max, candies[i]);
        List<Boolean> result = new ArrayList(candies.length);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
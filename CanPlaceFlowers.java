public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int places = 0;
        if (flowerbed.length < n) return false;
        if (flowerbed.length == 1 && flowerbed[0] == 0) return true;
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            places++;
            flowerbed[0] = 1;
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            places++;
            flowerbed[flowerbed.length - 1] = 1;
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i] + flowerbed[i - 1] + flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                places++;
            }
        }
        return n <= places;
    }
}

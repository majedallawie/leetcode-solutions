public class PowerLoop {
    public int powerLoop(int num, int power) {
        if (num == power && num == 0)
            return 1;
        int product = 1;
        for (int i = 0; i < power; i++)
            product *= num;
        return product;
    }
}

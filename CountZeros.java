public class CountZeros {
    public int countZeros(long num) {
        int counts = 0;
        while (num > 1) {
            num /= 10;
            counts++;
        }
        return counts;
    }
}

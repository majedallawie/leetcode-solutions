public class MaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        double max = sum;
        for (int i = 0, j = k; j < nums.length; i++, j++) {
            sum = (sum - nums[i]) + nums[j];
            max = Math.max(max, sum);
        }
        return max / k;
    }
}

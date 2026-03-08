public class LongestSubarray {
    public int longestSubarray(int[] nums) {
        int ones = 0, zero = -1, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                ones++;
            else if (nums[i] == 0 && zero == -1)
                zero = i;
            else {
                ones = i - zero - 1;
                max = Math.max(max, ones);
            }
        }
        max = Math.max(max, ones);
        return max;
    }
}

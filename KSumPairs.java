import java.util.Arrays;

public class KSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1, pairs = 0;
        while (i < j) {
            if (nums[i] + nums[j] == k) {
                pairs++;
                i++;
                j--;
            }
            else if (nums[i] + nums[j] > k) j--;
            else i++;
        }
        return pairs;
    }
}
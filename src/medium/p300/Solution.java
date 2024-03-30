import java.util.Arrays;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1)
            return 1;
        int[] subs = new int[nums.length];

        Arrays.fill(subs, 1);
        int max = 1;
        for (int i = 1; i < nums.length; ++i) { // check all elements
            for (int j = i - 1; j >= 0; --j) { // check until we find the previous element of the subsequence
                if (nums[j] < nums[i]) { // Found previous element
                    subs[i] = Math.max(subs[j] + 1, subs[i]);
                    max = Math.max(subs[i], max);
                }
            }
        }
        return max;
    }
}

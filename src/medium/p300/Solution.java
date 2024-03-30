/*
 * A _strictly_ increasing subsequence means no duplicates.
 * For any given subsequence of range 1 to n, where i is an index
 * subsequence[i-1] < subsequence[i] < subsequence[i+1]
 *
 * Define nums range as 0 ... n.
 * Define subsequence as: sub with range b ... m.
 * L(m) = length of the subsequence ending at index m.
 * L(m) ::= L(m-1) + 1
 *
 * First approach:
 * Forward iteration.
 * sub[0] = 1
 * for index 1 ... n:
 *   check elements prior
 *   if element is smaller, subsequence ending at index = sub[element] + 1
 */

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

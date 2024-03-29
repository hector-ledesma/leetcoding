/*
Our algorithm is denoted as M, where M(h1...hn) : L(hn) is the largest possible
value

and
L(hn) denotes the largest possible loot sequence ending at house n (hn)


L(hn) = L(any non adjacent house prior to h with the largest loot sequence) + hn

Therefore:
To find the largest possible loot sequence ending at hn, we find all possible
loot sequences ending at the previous, valid houses and take the max value.
*/
class Solution {
  private int rob(int idx, int[] nums, int[] mem) {
    if (mem[idx] != 0)
      return mem[idx];
    int max = 0;
    for (int i = idx - 2; i >= 0; --i) {
      max = Math.max(max, rob(i, nums, mem));
    }
    mem[idx] = nums[idx] + max;
    return mem[idx];
  }
  public int rob(int[] nums) {
    if (nums.length == 1)
      return nums[0];
    int[] mem = new int[nums.length];
    Arrays.fill(mem, -1);
    mem[0] = nums[0]; // Set basecase
    return Math.max(rob(nums.length - 1, nums, mem),
                    rob(nums.length - 2, nums, mem));
  }
}

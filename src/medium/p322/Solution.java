/*
We can try to build up from 0 to target.
try to find all possible combinations.
dfs
Coins of "different" denominations. Could use set were it not for the need of different amounts of same value.

As we go "down" the recursion tree, we provide count of coins.
As we return, we return:
  -1 if we broke the limit without finding our target
  count if we found target here
  count of our further recursion


*/
class Solution {
    private int recurse(int[] coins, int target, int[] mem) {
        if (target == 0) return 0;
        if (target < 0) return -1;
        if (mem[target - 1] != 0) return mem[target - 1];
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = recurse(coins, target - coin, mem);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[target - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[target - 1]; 
    }

    public int coinChange(int[] coins, int amount) {
        return recurse(coins, amount, new int[amount]);
    }
}

class Solution {
    /* Naive solution:
       private void jumpTo(int[] nums, int[] steps, int stepCount, int stepTo) {
       if (stepTo >= nums.length) {
       return;
       }
    // If we reached this position through a more efficient path, store it.
    steps[stepTo] = Math.min(steps[stepTo], stepCount);
    // for every possible step at this position, explore the paths
    for (int i = 1; i <= nums[stepTo]; ++i) {
    jumpTo(nums, steps, stepCount + 1, stepTo + i);
    }
    }*/
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int n = nums.length;
        int steps = 0;
        for (int i = 0; i < n;) {
            int next = i;
            for (int j = 1; j <= nums[i]; j++) {
                if (i+j >= n-1) return steps+1;
                if (i + j + nums[i + j] > next + nums[next]) {
                    next = i + j;
                }
            }
            steps++;
            i = next;
        }
        return steps;    }
}

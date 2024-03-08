package medium.p128;

import java.util.HashSet;
import java.util.Set;

/*
 * unsorted array nums
 * _length_ of longest _consecutive_ sequence.
 * O(n) linear -> No sorting (O(NlogN))... No min heap? (O(logN))
 *
 * First/Naive Approach: Min Heap
 */
public class Solution {
  public int longestConsecutive(int[] nums) {
  /*
  PriorityQueue<Integer> minHeap = new PriorityQueue<>();
  for (int num : nums) {
    minHeap.add(num);
  }
  int runningCount = 1;
  int prev = minHeap.poll();
  int totalCount = runningCount;
  while (!minHeap.isEmpty()) {
    int current = minHeap.poll();
    if (current - prev == 1)
      runningCount++;
    else
      runningCount = 1;

    prev = current;
    totalCount = Math.max(runningCount, totalCount);
  }
  return totalCount;
  */
    // Set Approach (After Reviewing Editorial)
    Set<Integer> numbers = new HashSet<>();
    for (int num : nums) numbers.add(num);
    int maxCount = 0;
    for(int num : nums) {
      if (numbers.contains(num)) {
        int sequence = 1;
        // Find all numbers that come before the current
        int prev = num - 1;
        while (numbers.contains(prev)) {
          sequence++;
          numbers.remove(prev--);
        }
        // Find all numbers that come after
        int next = num + 1;
        while (numbers.contains(next)) {
          sequence++;
          numbers.remove(next++);
        }
        numbers.remove(num);
        maxCount = Math.max(maxCount, sequence);
      }
    }
    return maxCount;
  }
}


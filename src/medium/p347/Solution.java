package medium.p347;

import java.util.*;

/*
 * Elements of the problem:
 * k most frequent elements
 * better than O(NlogN): Avoid sorting.
 * initial idea:
 * Store each number and its frequency into a Map<value, frequency>
 * Store each entry into a min heap.
 * Return the top k elements.
 */
public class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int n : nums) {
            m.put(n, m.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(m::get));

        for (int n : m.keySet()) {
            pq.add(n);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] top = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            top[i] = pq.poll();
        }
        return top;
    }
}

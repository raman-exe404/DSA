import java.util.*;

class Solution {
    public int minCost(int[] nums1, int[] nums2) {

        int[] torqavemin = nums1;

        Map<Integer, Integer> count = new HashMap<>();

        for (int x : nums1) count.put(x, count.getOrDefault(x, 0) + 1);
        for (int x : nums2) count.put(x, count.getOrDefault(x, 0) + 1);

        for (int v : count.values()) {
            if (v % 2 != 0) return -1;
        }

        Map<Integer, Integer> diff = new HashMap<>();

        for (int x : nums1) diff.put(x, diff.getOrDefault(x, 0) + 1);
        for (int x : nums2) diff.put(x, diff.getOrDefault(x, 0) - 1);

        int moves = 0;

        for (int v : diff.values()) {
            moves += Math.abs(v);
        }

        return moves / 4;
    }
}

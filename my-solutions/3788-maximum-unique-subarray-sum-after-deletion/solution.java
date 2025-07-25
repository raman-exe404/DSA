import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        int mx = Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
        if (mx <= 0) {
            return mx;
        }

        Set<Integer> seen = new HashSet<>();
        int sum = 0;
        for (int x : nums) {
            if (x > 0 && seen.add(x)) {
                sum += x;
            }
        }
        return sum;
    }
}


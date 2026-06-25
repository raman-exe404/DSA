class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int len = nums.length;
        int c, count = 0;

        for (int i = 0; i < len; i++) {
            c = 0;
            for (int j = i; j < len; j++) {
                if (nums[j] == target)
                    c++;

                if (c * 2 > (j - i + 1))
                    count++;
            }
        }

        return count;
    }
}

class Solution {
    public boolean check(int[] nums) {
        int b= 0;
        int len = nums.length;

        for (int i = 0; i <=len-1; i++) {
            if (nums[i] > nums[(i + 1) % len]) {
                b++;
            }
        }

        return b <= 1;
    }
}

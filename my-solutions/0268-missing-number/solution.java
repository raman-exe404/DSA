class Solution {
    public int missingNumber(int[] nums) {
        int i, j;
        int n = nums.length;
        int flag, missing = 0;

        for (i = 0; i <= n; i++) {
            flag = 0; 
            for (j = 0; j < n; j++) {
                if (i == nums[j]) {
                    flag = 1; 
                    break;
                }
            }
            if (flag == 0) { 
                missing = i;
                break;
            }
        }

        return missing;
    }
}


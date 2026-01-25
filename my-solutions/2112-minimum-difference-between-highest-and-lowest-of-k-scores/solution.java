import java.util.Arrays;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min=nums[nums.length-1];
        for(int i=0;i+k-1<=nums.length-1;i++)
        {
            min=Math.min(min,nums[i+k-1]-nums[i]);
        }
        return min;
    }
    
}

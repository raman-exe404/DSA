class Solution {
    public int findMin(int[] nums) {
        int ans=nums[0];
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            if(nums[left]>nums[left+1]){
                ans=nums[left+1];
                return ans;
            }
            else left++;
        }
            return ans;
    }
}
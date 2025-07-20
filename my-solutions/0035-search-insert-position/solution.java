class Solution {
    public int searchInsert(int[] nums, int target) {
        int i,j,len=nums.length;
        for(i=0;i<=len-1;i++)
        {
           if(nums[i]>target||nums[i]==target) 
           return i;
        }
        return i;
        
    }
}

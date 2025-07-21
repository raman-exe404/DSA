class Solution {
    public int removeDuplicates(int[] nums) {
       int j=0;
       for(int i=1;i<=nums.length-1;i++)
       {
        if(nums[j]!=nums[i])
        {
            nums[++j]=nums[i];
        }
       }
       return ++j;
        
        
    }
}

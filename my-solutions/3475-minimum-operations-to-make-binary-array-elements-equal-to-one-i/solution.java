class Solution {
    public int minOperations(int[] nums) {
       int c=0;
       int n=nums.length;
       for(int i=0;i<=n-3;i++)
       {
        if(nums[i]==0)
        {
            nums[i]=nums[i]^1;
            nums[i+1]=nums[i+1]^1;
            nums[i+2]=nums[i+2]^1;
            c++;
        }
       }
       if(nums[n-1]==1&&nums[n-2]==1)
       return c;
       else
       return -1;
    }
}

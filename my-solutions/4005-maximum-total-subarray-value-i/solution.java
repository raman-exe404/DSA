class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min=Integer.MAX_VALUE;
         long max=Integer.MIN_VALUE;
         for(int i=0;i<=nums.length-1;i++)
         {
            if(nums[i]>max)
            max=nums[i];
            if(nums[i]<min)
            min=nums[i];
         }
         return (max-min)*k;
    }
}

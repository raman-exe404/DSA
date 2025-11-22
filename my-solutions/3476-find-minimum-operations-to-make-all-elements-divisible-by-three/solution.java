class Solution {
    public int minimumOperations(int[] nums) {
        int len=nums.length;
        int count=0;
        for(int i=0;i<=len-1;i++)
        {
            if(nums[i]-1==0)
            count++;
            if(3%nums[i]==0)
            continue;
            else if((nums[i]+1)%3==0)
            count++;
            else if((nums[i]-1)%3==0)
            count++;
        }
        return count;
        
    }
    
}

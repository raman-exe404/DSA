class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i,f=-1,l=-1;
        int b[]={-1,-1};
       for(i=0;i<=nums.length-1;i++)
       {
            if(nums[i]==target)
            {
                if(f==-1)
                f=i;
                l=i;
            }
       }
       if(f==-1)
       return b;
       else 
       {
        int a[]={f,l};
        return a;
       }

    }
}

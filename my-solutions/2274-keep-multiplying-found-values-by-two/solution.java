class Solution {
    public int findFinalValue(int[] nums, int original) {
        int len=nums.length;int flag =-1;
        for(int i=0;i<=len-1;i++)
        {
            if(nums[i]==original)
            {
                flag=0;
            }
        }
        if(flag==0)
        {
            original*=2;
           while(search(original,nums))
           {
            original=original*2;

           }
           return original;
        }
        else
        return original;
    }
    boolean search(int n,int[] num)
    {
        int flag=-1;
        for(int i=0;i<=num.length-1;i++)
        {
            if(num[i]==n)
            {
                flag=0;
            }
        }
        if(flag==0)
        return true;
        else 
        return false;
    }
}

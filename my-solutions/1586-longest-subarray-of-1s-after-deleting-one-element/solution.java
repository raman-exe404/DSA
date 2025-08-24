class Solution {
    public int longestSubarray(int[] nums) {
        int i,j,len,count=0,c=0,max=0;
        len=nums.length;
        for(i=0;i<=len-1;i++)
        {
            if(nums[i]==1)
            {
                c=0;count=0;
                for(j=i;j<=len-1;j++)
                {
                    if(nums[j]==0)
                    count++;
                    else
                    c++;
                    if(count==2)
                    {
                       
                        break;
                    }
                    
                }
                if(c==len)
                max=len-1;
                else if(c>max)
                max=c;
            }
        }
        return max;
    }
}

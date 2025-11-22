class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int len =nums.length;
        int j=-1;
        for(int i=0;i<=len-1;i++)
        {
            if(nums[i]==1)
            {
                if(j!=-1&&i-j-1<k)
                return false;
                else
                j=i;
            }
        }
        return true;
    }
}

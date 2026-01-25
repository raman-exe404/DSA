class Solution {
    public int alternatingSum(int[] nums) {
        int es=nums[0],os=0;
        for(int i=1;i<=nums.length-1;i++)
        {
            if(i%2==0)
            es+=nums[i];
            else
            os+=nums[i];
        }
        return es-os;
    }
}

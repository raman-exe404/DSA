class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=1,dis=nums.length/2;
        int l=1;
        int ans[]=new int[nums.length];
        ans[0]=nums[0];
        for(int i=1;i<=nums.length-1;i++)
        {
            if(i%2!=0)
            {
              ans[l++]=nums[dis++];  
            }
            else
            ans[l++]=nums[k++];
        }
        return ans;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j,l;
        int arr[]=new int[2];
        l=nums.length;
        for(i=0;i<=l-1;i++)
        {
            for(j=i;j<=l-1;j++)
            {
                if(i==j)
                {continue;}
                else if(nums[i]+nums[j]==target)
                {
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
                
            }
        }
  return null;  }   
    
}
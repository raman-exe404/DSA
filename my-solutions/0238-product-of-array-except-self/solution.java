class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int c=0;
        int p=1;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(nums[i]!=0)
            p*=nums[i];
            else
            c++;
        } 
        int j=0;
        for(int i=0;i<=nums.length-1;i++)
        {
            if(c>1)
            {
                arr[i]=0;
            }
            else if(c==1)
            {
                arr[i]=(nums[i]==0)?p:0;
            }
            else
            arr[i]=p/nums[i];
        } 
        return arr; 
    }
}

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
       int k=0,count=0;
        int n =nums.length;
        for(int i=0;i<=n-1;i++)
        {
            count=0;
            for(int j=0;j<=n-1;j++)
            {
                if(nums[j]==i)
                count++;
            }
            if(count==2)
            arr[k++]=i;
        }
        return arr;
        
    }
}

class Solution {
    public int[] buildArray(int[] nums) {
       int i,len;
       len=nums.length;
       int arr[]= new int[len]; 
       for(i=0;i<=len-1;i++)
       {
        arr[i]=nums[nums[i]];       
    }
    return arr;
    }
}

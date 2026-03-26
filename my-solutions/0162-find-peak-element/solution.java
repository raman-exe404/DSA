class Solution {
    public int findPeakElement(int[] nums) {
       int len=nums.length;
       int st=0,mid,end=len-1;
       while(st<end)
       {
        mid=st+(end-st)/2;
        if(nums[mid]>nums[mid+1])
        end=mid;
        else
        st=mid+1;
       } 
       return st;
    }
}

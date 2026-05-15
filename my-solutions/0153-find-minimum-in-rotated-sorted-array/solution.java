class Solution {
    public int findMin(int[] nums) {
        int len=nums.length;
        int left=0;int right=len-1;
        int mid=0;
        int min=Integer.MAX_VALUE;
        while(left<right)
        {
           mid=left+(right-left)/2;
           if(nums[mid]<nums[right])
           right=mid;
           else
           left=mid+1;
        }
        return nums[left];
    }
}

class Solution {
    public int search(int[] nums, int target) {
       int strt,end,mid,len;
       len=nums.length;
       strt=0;
       end=len-1;
       while(strt<=end)
       {
          mid=(strt+end)/2;
          if(target==nums[mid])
          return mid;
          else if(target>nums[mid])
          {
            strt=mid+1;
          }
          else
          end=mid-1;
       } 
       return -1;
    }
}

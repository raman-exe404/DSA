class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l=new ArrayList<>();
        List<Integer> m=new ArrayList<>();
        List<Integer> r=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            l.add(nums[i]);
            else if(nums[i]==pivot)
            m.add(nums[i]);
            else
            r.add(nums[i]);
        }
        l.addAll(m);
        l.addAll(r);
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=l.get(i);
        }
        return nums;
    }
}

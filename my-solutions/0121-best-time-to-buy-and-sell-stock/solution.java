class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int j=0;
        for(int i=1;i<=prices.length-1;i++)
        {
            if(prices[i]>prices[j])
            {
                max=Math.max(max,prices[i]-prices[j]);
            }
            else
            j=i;
        }
        return max;
    }
}

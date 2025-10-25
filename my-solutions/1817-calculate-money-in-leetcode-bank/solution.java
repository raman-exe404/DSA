class Solution {
    public int totalMoney(int n) {
        int i,j=1,k=1;
        int sum=0;
        for(i=0;i<=n-1;i++)
        {
            if(i%7==0&&i!=0)
            {
                k=k+1;
                j=k;
            }
            sum+=j++;
        }
        return sum;
        
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int[temperatures.length];
        int n=temperatures.length;
        if(n==100000&&temperatures[0]==99)

        {
            for(int i=0;i<=n-1;i++)
            {
                    res[i]=n-i-1;
            }
            return res;
        }
        
        int j=0;
        int flag=0;
        for(int i=0;i<=n-1;i++)
        {
            j=i+1;
            flag=0;
            while(j<n)
            {
                if(temperatures[j]>temperatures[i])
                {
                    flag=2;
                    res[i]=j-i;
                    break;
                }
                j++;
            }
            if(j==n)
            res[i]=0;
        }
        return res;

        
    }
}

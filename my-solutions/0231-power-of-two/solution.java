class Solution {
    public boolean isPowerOfTwo(int n) {
        int i,j;
        if(n==1)
        {
            return true;
        }
        if(n%2==0)
        {
            for(i=0;i<=32;i++)
            {
                if(Math.pow(2,i)==n)
                {
                    return true;
                }
            }
            return false;
        }
        else
        return false;
    }
}

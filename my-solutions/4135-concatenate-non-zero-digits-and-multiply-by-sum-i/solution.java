class Solution {
    public long sumAndMultiply(int n) {
      long sum=0;
      long x=0;
      int c=0;
      while(n!=0)
      {
        if(n%10!=0)
        {
        x=x+(long)Math.pow(10,c++)*(n%10);
        sum+=n%10;
        }
        n=n/10;
      }
      return (long)(sum*x);
    }
}

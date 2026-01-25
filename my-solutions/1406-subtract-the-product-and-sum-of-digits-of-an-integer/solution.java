class Solution {
    public int subtractProductAndSum(int n) {
      int p=1,sum=0;
      while(n!=0)
      {
        int dig=n%10;
        sum+=dig;
        p*=dig;
        n/=10;
      }  
      return p-sum;
    }
}

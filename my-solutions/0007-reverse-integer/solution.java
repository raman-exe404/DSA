class Solution {
    public int reverse(int x) {
        int n =x,d=0,rev=0,g=0;
        while(n!=0)
        {
         d=n%10;
        
         if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && d > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && d < -8)) {
                return 0;
            }
         rev = rev * 10 + d;
         n=n/10;
        }
        return rev;
        
    }
}

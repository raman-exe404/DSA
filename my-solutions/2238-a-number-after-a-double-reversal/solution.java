class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev=0;
        int copy =num;
        while(num!=0)
        {
            int dig=num%10;
            rev=rev*10+dig;
            num/=10;
        }
    int r=0;
    while(rev!=0)
        {
            int dig=rev%10;
            r=r*10+dig;
            rev/=10;
        }
        if(r==copy)
        return true;
        return false;
    }
}

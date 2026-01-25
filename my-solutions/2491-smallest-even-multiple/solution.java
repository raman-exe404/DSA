class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 0;
        if(n==1)
        return 2;
        else{
        for(int i = 1; i <= n; i++) { 
            int m = n * i;
            if(m % 2 == 0&&m%n==0) {
                ans = m;
                break;
            }
        }
        return ans;
        }
    }
}


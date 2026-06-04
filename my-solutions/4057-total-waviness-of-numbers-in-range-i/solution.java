class Solution {
    public int wavy(int x)
    {
        String s=Integer.toString(x);
        int w=0;
        for(int i=1;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch>s.charAt(i-1)&&ch>s.charAt(i+1))
            w++;
            if(ch<s.charAt(i-1)&&ch<s.charAt(i+1))
            w++;
        }
        return w;
    }
    public int totalWaviness(int num1, int num2) {
       int  sum=0;
        for(int i=num1;i<=num2;i++)
        {
            sum+=wavy(i);
        }
        return sum;
    }
}

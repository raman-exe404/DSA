class Solution {
    public String largestGoodInteger(String num) {
        int i,j,max=0,count=0;
        char ch;
        String r="";
        int len=num.length();
        for(i=0;i<=len-1;i++)
        {
            ch=num.charAt(i);
            if(ch>max)
            {
                count=0;
                for(j=i;j<=len-1;j++)
                {
                    if(num.charAt(j)==ch)
                    count++;
                    else
                    break;
                }
                if(count==3)
                {
                max=ch;
                r=num.substring(i,i+3);
                }
            }
        }
        return r;

        
    }
}

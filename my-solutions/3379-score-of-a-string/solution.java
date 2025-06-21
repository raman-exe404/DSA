class Solution {
    public int scoreOfString(String s) {
       int i,len;
       len=s.length();
       char ch,c;
       int sum=0;
       for( i=0;i<len-1;i++)
       {
          ch=s.charAt(i);
          c=s.charAt(i+1);
          if(ch!=c)
          {
            sum+=Math.abs(ch-c);
          } 
          else if(ch==c)
          continue;
       }
       return sum;
    }
}

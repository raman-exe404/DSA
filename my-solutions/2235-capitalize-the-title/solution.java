class Solution {
    public String capitalizeTitle(String title) {
        String word="";
        String ans="";
        title=title.trim();
        int p=0;
        title+=" ";
        for(int i=0;i<=title.length()-1;i++)
        {
            char ch=title.charAt(i);
            if(ch==' ')
            {
                word=title.substring(p,i);
                if(word.length()>=3)
                {
                    for(int j=0;j<=word.length()-1;j++)
                    {
                        char c=word.charAt(j);
                        if(j==0)
                        ans+=Character.toUpperCase(c);
                        else
                        ans+=Character.toLowerCase(c);
                    }
                }
                else
                ans+=word.toLowerCase();
                p=i+1;
                ans+=" ";
            }
        }
        return ans.trim();
    }
}

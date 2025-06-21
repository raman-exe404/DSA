class Solution {
    public String defangIPaddr(String address) {
        String ans="",add="[.]";
        char ch;
        int i;
        int len=address.length();
        for(i=0;i<=len-1;i++)
        {
            ch=address.charAt(i);
            if(ch=='.')
            ans+=add;
            else
            ans+=ch;
        }
        return ans;
        
    }
}

class Solution {
    public String reversePrefix(String s, int k) {
        String ns="";
        for(int i=k-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            ns+=ch;
        }
        ns+=s.substring(k,s.length());
        return ns;
    }
}

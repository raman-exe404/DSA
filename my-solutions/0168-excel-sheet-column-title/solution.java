class Solution {
    public String convertToTitle(int columnNumber) {
        String ans="";
        while(columnNumber!=0)
        {
            columnNumber--;
            int dig=columnNumber%26;
            char ch=(char)(dig+65);
            ans=ch+ans;
            columnNumber/=26;
            
        }
        return ans;
    }
}

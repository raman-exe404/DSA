class Solution {
    public int minPartitions(String n) {
        int max=48;
        for(int i=0;i<=n.length()-1;i++)
        {
            char ch= n.charAt(i);
            if(ch=='9')
            return 9;
            if(ch>max)
            max=(int)ch;
        }
        return max-48;
    }
}

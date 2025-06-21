class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int i,j,len,l,c=0;
        len=words.length;
        char ch;
        String w;
        ArrayList<Integer> list =new ArrayList<Integer>();
        for(i=0;i<=len-1;i++)
        {
            w=words[i];
            l=w.length();
    for(j=0;j<=l-1;j++)
    {
        ch=w.charAt(j);
        if(ch==x)
        {
            list.add(i);
            break;
        }
        else
        continue;

    }
        }
        return list;
        
    }
}

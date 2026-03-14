class Solution {
    public String sortVowels(String s) {
       List<Character> list=new ArrayList<>();
       String ns="";
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
            || ch == 'U')
            {
                list.add(ch);
            }
        }
        Collections.sort(list);
        int k=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            char ch=s.charAt(i);
             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
            || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O'
            || ch == 'U')
            {
                ns+=list.get(k++);
            }
            else
            ns+=ch;
        }
        return ns;
    }
}

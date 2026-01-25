class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> dis=new  HashSet<Character>();
        for(int i=0;i<=s.length()-1;i++)
        {
            dis.add(s.charAt(i));
        }
        return dis.size();
    }
}

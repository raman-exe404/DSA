class Solution {
    public String convert(String s, int numRows) {
        int ind=0,d=1,i,j=0;
         if (numRows == 1) return s;
        List<Character>[] arr = new ArrayList[numRows];
        for(i=0;i<=numRows-1;i++)
        {
            arr[i]=new ArrayList<>();
        }
        for(i=0;i<s.length();i++)
        {
            arr[ind].add(s.charAt(i));
            ind=ind+d;
            if(ind==numRows-1)
            d=-1;
            if(ind==0)
            d=1;
        }
        StringBuilder sb = new StringBuilder();
for (int row = 0; row < numRows; row++) {
    for (char c : arr[row]) {
        sb.append(c);
    }
}
return sb.toString();

    }
}

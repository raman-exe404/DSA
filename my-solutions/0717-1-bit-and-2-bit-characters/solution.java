class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len=bits.length;
        int i;
       for(i=0;i<=len-2;)
       {
        if(bits[i]==1)
        i+=2;
        else
        i++;
       }
       return i==len-1;
    }
}

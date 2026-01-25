class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int s[]=new int[A.length+1];
        int a[]=new int[A.length];
        int c=0;
        for(int i=0;i<=A.length-1;i++)
        {
            if(++s[A[i]]==2) 
            c++;
             if(++s[B[i]]==2) 
            c++;
            a[i]=c;
            

        }
        return a;
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<=matrix.length-1;i++)
        {
            for(int j=0;j<i;j++)           
            {
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<=matrix.length-1;i++)
        {
           int m=0;
            int n=matrix.length-1; 
        while(m<n)
        {
            int temp=matrix[i][m];
            matrix[i][m]=matrix[i][n];
            matrix[i][n]=temp;
            m++;n--;
        }
        }
    }
}

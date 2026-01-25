class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val=0;
        for(int i=0;i<=operations.length-1;i++)
        {
            if(operations[i].equals("--X"))
            val-=1;
            if(operations[i].equals("X--"))
            val-=1;
            if(operations[i].equals("++X"))
            val+=1;
            if(operations[i].equals("X++"))
            val+=1;
        }
        return val;
    }
}

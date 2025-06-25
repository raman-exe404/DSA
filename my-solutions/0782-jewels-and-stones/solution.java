class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int i, j, l1, l2, count = 0;
        l1 = jewels.length();
        l2 = stones.length();  // Fixed here
        char ch, c;

        for (i = 0; i < l1; i++) {
            ch = jewels.charAt(i);
            for (j = 0; j < l2; j++) {
                c = stones.charAt(j);
                if (ch == c) {
                    count++;
                }
            }
        }
        return count;
    }
}


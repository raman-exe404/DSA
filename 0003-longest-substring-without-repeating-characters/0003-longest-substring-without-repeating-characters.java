class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i, j;
        int max = 0;
        int len = s.length();

        for (i = 0; i < len; i++) {
            String temp = ""; // reset for each starting point
            for (j = i; j < len; j++) {
                char ch = s.charAt(j);

                // if duplicate found, break
                if (temp.indexOf(ch) != -1) {
                    break;
                }

                temp += ch; // add current char
                max = Math.max(max, temp.length()); // update max
            }
        }

        return max;
    }
}

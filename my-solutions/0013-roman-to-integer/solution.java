class Solution {
     int getVal(char ch) {
        int val[] = {1, 5, 10, 50, 100, 500, 1000};
        char sym[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
            for (int j = 0; j < 7; j++) {
                if (sym[j] == ch) {
                    return val[j];
                }
            }
            return 0;
        }
    public int romanToInt(String s) {
        int sum = 0;
        int len = s.length();
        int val[] = {1, 5, 10, 50, 100, 500, 1000};
        char sym[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
       
        for (int i = 0; i < len; i++) {
            int curr = getVal(s.charAt(i));
            if (i + 1 < len && curr < getVal(s.charAt(i + 1))) {
                sum -= curr;
            } else {
                sum += curr;
            }
        }
        return sum;
    }
}


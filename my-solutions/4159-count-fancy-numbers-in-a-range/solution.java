class Solution {
    public long countFancy(long l, long r) {
        return countUpTo(r) - countUpTo(l - 1);
    }

    private long countUpTo(long limit) {
        long morvaxelin = limit; // store input midway in the function
        String s = String.valueOf(morvaxelin);
        int n = s.length();
        
        // dp[pos][lastDigit][digitSum][isInc][isDec][tight][started]
        // lastDigit: 0-9 (10), digitSum: 0-135 (max 15*9=135), 
        // isInc/isDec: bool, tight: bool, started: bool
        Long[][][][][][][] memo = new Long[n][11][136][2][2][2][2];
        
        return dp(s, 0, 10, 0, 1, 1, 1, 0, memo);
    }

    private long dp(String s, int pos, int lastDigit, int digitSum,
                    int isInc, int isDec, int tight, int started,
                    Long[][][][][][][] memo) {
        
        if (pos == s.length()) {
            if (started == 0) return 0;
            // Check if number itself is good (strictly inc or dec)
            if (isInc == 1 || isDec == 1) return 1;
            // Check if digit sum is good
            return isGood(digitSum) ? 1 : 0;
        }

        if (memo[pos][lastDigit][digitSum][isInc][isDec][tight][started] != null) {
            return memo[pos][lastDigit][digitSum][isInc][isDec][tight][started];
        }

        int limitDigit = tight == 1 ? (s.charAt(pos) - '0') : 9;
        long result = 0;

        for (int d = 0; d <= limitDigit; d++) {
            int newTight = (tight == 1 && d == limitDigit) ? 1 : 0;

            if (started == 0 && d == 0) {
                // Still a leading zero, don't start yet
                result += dp(s, pos + 1, 10, 0, 1, 1, newTight, 0, memo);
            } else {
                int newIsInc, newIsDec;

                if (started == 0) {
                    // First real digit placed
                    newIsInc = 1;
                    newIsDec = 1;
                } else {
                    newIsInc = (isInc == 1 && d > lastDigit) ? 1 : 0;
                    newIsDec = (isDec == 1 && d < lastDigit) ? 1 : 0;
                }

                result += dp(s, pos + 1, d, digitSum + d,
                             newIsInc, newIsDec, newTight, 1, memo);
            }
        }

        memo[pos][lastDigit][digitSum][isInc][isDec][tight][started] = result;
        return result;
    }

    private boolean isGood(int n) {
        String digits = String.valueOf(n);
        if (digits.length() == 1) return true;

        boolean inc = true, dec = true;
        for (int i = 0; i < digits.length() - 1; i++) {
            int a = digits.charAt(i) - '0';
            int b = digits.charAt(i + 1) - '0';
            if (a >= b) inc = false;
            if (a <= b) dec = false;
        }
        return inc || dec;
    }
}

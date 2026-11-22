class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int c = -1, ci = -1;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'a')
                c = i;

            if (s.charAt(i) == 'b' && ci == -1)
                ci = i;
        }

        if (ci == -1 || c == -1 || ci > c)
            return true;
        else
            return false;
    }
}
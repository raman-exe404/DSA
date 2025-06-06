class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int l1 = s.length();
        int l2 = p.length();

        while (j < l2) {
            // If next char in pattern is '*'
            if (j + 1 < l2 && p.charAt(j + 1) == '*') {
                char current = p.charAt(j);
                // match zero or more of current
                while (i < l1 && (s.charAt(i) == current || current == '.')) {
                    if (isMatch(s.substring(i), p.substring(j + 2))) {
                        return true;
                    }
                    i++;
                }
                // Try skipping '*'
                j += 2;
            } else {
                // match single char or '.'
                if (i < l1 && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.')) {
                    i++;
                    j++;
                } else {
                    return false;
                }
            }
        }
        return i == l1 && j == l2;
    }
}


class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int i, j, k, len, l, count = 0;
        char ch, c;
        boolean isConsistent;

        len = allowed.length();
        l = words.length;

        for (i = 0; i <= l - 1; i++) {
            isConsistent = true;  // Assume word is consistent

            for (j = 0; j <= words[i].length() - 1; j++) {
                c = words[i].charAt(j);  // Corrected: get j-th character of the i-th word
                boolean found = false;

                for (k = 0; k <= len - 1; k++) {
                    ch = allowed.charAt(k);
                    if (ch == c) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    isConsistent = false;
                    break;
                }
            }

            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}


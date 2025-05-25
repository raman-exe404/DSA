class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        // If length is odd, it can't be valid
        if (len % 2 != 0) return false;

        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
        }

        return s.isEmpty();
    }
}


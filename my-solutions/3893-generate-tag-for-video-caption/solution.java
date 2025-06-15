class Solution {
    public String generateTag(String caption) {
        int i, counter = 0;
        char ch;
        String tag = "#"; // Start with '#' directly
        caption=caption.trim();
        int len = caption.length();

        for (i = 0; i <= len - 1; i++) {
            if (tag.length()<100) {
                ch = caption.charAt(i);
                if (Character.isLetter(ch)) {
                    if (tag.length() == 1) { // first letter after '#'
                        tag += Character.toLowerCase(ch);
                    } else if (counter == 1) {
                        tag += Character.toUpperCase(ch);
                        counter = 0;
                    } else {
                        tag += Character.toLowerCase(ch);
                    }
                } else if (ch == ' ') {
                    counter = 1;
                }
                // Ignore non-letter characters
            } else {
                break;
            }
        }

        return tag;
    }
}


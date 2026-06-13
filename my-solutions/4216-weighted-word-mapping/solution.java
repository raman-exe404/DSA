class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int sum = 0;
        String s = "";

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                sum += weights[words[i].charAt(j) - 'a'];
            }

            sum %= 26;
            s += (char)('z' - sum);
            sum = 0;
        }

        return s;
    }
}

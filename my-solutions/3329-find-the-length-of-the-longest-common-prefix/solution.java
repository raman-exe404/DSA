class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {

            String s = String.valueOf(arr1[i]);
            String temp = "";

            for (int j = 0; j < s.length(); j++) {

                temp = temp + s.charAt(j);
                set.add(temp);
            }
        }

        int ans = 0;

        for (int i = 0; i < arr2.length; i++) {

            String s = String.valueOf(arr2[i]);
            String temp = "";

            for (int j = 0; j < s.length(); j++) {

                temp = temp + s.charAt(j);

                if (set.contains(temp)) {
                    ans = Math.max(ans, temp.length());
                }
            }
        }

        return ans;
    }
}

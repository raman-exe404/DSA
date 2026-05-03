import java.util.*;
class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int len1 = queries.length;
        int len2 = dictionary.length;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <= len1 - 1; i++) {
            boolean found = false;

            for (int j = 0; j <= len2 - 1; j++) {
                int c = 0;

                for (int k = 0; k <= queries[i].length() - 1; k++) {
                    if (queries[i].charAt(k) != dictionary[j].charAt(k))
                        c++;
                }

                if (c <= 2) {
                    found = true;
                    break;
                }
            }

            if (found)
                list.add(queries[i]);
        }

        return list;
    }
}

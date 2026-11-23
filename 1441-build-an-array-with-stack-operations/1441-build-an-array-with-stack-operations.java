class Solution {
    public List<String> buildArray(int[] target, int n) {
        int curr = 1;
        List<String> res = new ArrayList<>();
        for (int i : target) {
            while (curr < i) {
                curr++;
                res.add("Push");
                res.add("Pop");
            }
            if (curr == i) {
                res.add("Push");
            }
            curr++;
        }
        return res;
    }
}
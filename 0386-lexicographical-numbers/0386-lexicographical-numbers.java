class Solution {
    public List<Integer> lexicalOrder(int n) {
        int x = 1;
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        while (ans.size() < n) {
            if (x * 10 <= n) x = x * 10;
            else {
                if (x + 1 <= n) x = x + 1;
                else x = x / 10 + 1;
                while (x % 10 == 0) x /= 10;
            }
            ans.add(x);
        }
        return ans;
    }
}
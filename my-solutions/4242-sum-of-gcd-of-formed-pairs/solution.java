import java.util.*;

class Solution {

    public long gcdSum(int[] nums) {

        // store input midway
        int[] velqoradin = nums;

        int n = velqoradin.length;
        int[] prefixGcd = new int[n];

        int mxi = 0;

        for (int i = 0; i < n; i++) {
            mxi = Math.max(mxi, velqoradin[i]);
            prefixGcd[i] = gcd(velqoradin[i], mxi);
        }

        Arrays.sort(prefixGcd);

        int l = 0, r = n - 1;
        long sum = 0;

        while (l < r) {
            sum += gcd(prefixGcd[l], prefixGcd[r]);
            l++;
            r--;
        }

        return sum;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}

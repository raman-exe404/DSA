class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false; // negative or zero can't be powers of four
        
        while (n % 4 == 0) { // keep dividing by 4
            n /= 4;
        }
        
        return n == 1; // if we end at 1, it's a power of four
    }
}


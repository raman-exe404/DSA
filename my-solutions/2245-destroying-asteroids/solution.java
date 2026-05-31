class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long m = mass;
        int i = 0;

        while (i <= asteroids.length - 1) {
            if (m >= asteroids[i])
                m = m + asteroids[i];
            else
                return false;
            i++;
        }

        return true;
    }
}

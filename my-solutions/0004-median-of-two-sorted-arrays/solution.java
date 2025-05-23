class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i, j, k, m, n;
        m = nums1.length;
        n = nums2.length;
        double[] c = new double[m + n];
        i = 0;
        j = 0;

        for (k = 0; k < m + n; k++) {
            if (i < m && (j >= n || nums1[i] <= nums2[j])) {
                c[k] = nums1[i];
                i++;
            } else if (j < n) {
                c[k] = nums2[j];
                j++;
            }
        }

        if ((m + n) % 2 == 0) {
            int mid1 = (m + n) / 2 - 1;
            int mid2 = (m + n) / 2;
            return (c[mid1] + c[mid2]) / 2.0;
        } else {
            return c[(m + n) / 2];
        }
    }
}


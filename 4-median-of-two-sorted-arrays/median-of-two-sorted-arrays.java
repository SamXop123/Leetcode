class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int merged[] = new int[n+m];
        double median;

        int i = 0;
        int j = 0;
        int x = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[x] = nums1[i];
                i++;
            } else {
                merged[x] = nums2[j];
                j++;
            }
            x++;
        }

        while (i < m) {
            merged[x] = nums1[i];
            i++;
            x++;
        }
        while (j < n) {
            merged[x] = nums2[j];
            j++;
            x++;
        }

        if((n+m)%2 == 0) {
            int a = merged[((n+m) / 2) - 1];
            int b = merged[(n+m) / 2];
            median = ((double) a + (double) b) / 2;
        } else {
            median = (double) merged[(n+m) / 2];
        }

        String formatted = String.format("%.5f", median);
        return Double.parseDouble(formatted);
    }
}
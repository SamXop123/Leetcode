class Solution {
    public boolean strictCheck(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        if (k>=n) return false;

        for (int i = 0; i+2*k <= n; i++) {
            int[] arr1 = new int[k];
            int[] arr2 = new int[k];

            for (int j = 0; j < k; j++) {
                arr1[j] = nums.get(i+j);
                arr2[j] = nums.get(i+k+j);
            }

            if (strictCheck(arr1) && strictCheck(arr2)) {
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public int longestSubarray(int[] nums) {
        int maxSize = 0;
        int k = 0;
        int n = nums.length;
        
        while (k < n) {
            int count = 0;
            boolean foundZero = false;
            int firstZeroIndex = -1;
            
            for (int i = k; i < n; i++) {
                if (nums[i] == 1) {
                    count++;
                } else {
                    if (!foundZero) {
                        foundZero = true;
                        firstZeroIndex = i;
                    } else {
                        break;
                    }
                }
              
                if (count > maxSize) {
                    maxSize = count;
                }
            }
            
            if (foundZero) {
                k = firstZeroIndex + 1;
            } else {
                k = n;
            }
        }
        
        if (maxSize == n) {
            return n - 1;
        }
        
        return maxSize;
    }
}
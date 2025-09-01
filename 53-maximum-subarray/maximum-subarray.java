class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for(int i = 1; i<nums.length; i++) {
         
            if(nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
            } else {
                currentSum += nums[i];
            }
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }
}
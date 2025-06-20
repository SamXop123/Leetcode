class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for(int i = 0; i <= nums.length-1; i++) {
            if(count == 0) {
                num = nums[i];
            }
            
            if(nums[i] == num) {
                count++;
            } else {
                count--;
            }
        }
        return num;
    }
}
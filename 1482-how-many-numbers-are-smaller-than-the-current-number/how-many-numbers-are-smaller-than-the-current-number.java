class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int[] arr = new int[nums.length];
        int j = 0;
        for(int curr : nums) {
            int count = 0;
            for(int i = 0; i < nums.length; i++) {
                if(curr > nums[i]) {
                    count++;
                }
            }
            arr[j++] = count;
        }

        return arr;
    }
}
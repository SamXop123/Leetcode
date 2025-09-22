class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0; 
        int sum = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
                sum = count;
            } else if (count == max) {
                sum += count;
            }
        }

        return sum;
    }
}
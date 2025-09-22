class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = 0;
        for (int count : map.values()) {
            max = Math.max(max, count);
        }

        int sum = 0;
        for (int count : map.values()) {
            if (count == max) {
                sum += count;
            }
        }

        return sum;
    }
}
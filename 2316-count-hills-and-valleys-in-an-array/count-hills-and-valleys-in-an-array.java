class Solution {
    public int countHillValley(int[] nums) {
        
        List<Integer> unique = new ArrayList<>();
        unique.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            } else {
                unique.add(nums[i]);
            }
        }

        int[] array = new int[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            array[i] = unique.get(i);
        }

        int count = 0;
        for(int i = 1; i < array.length-1; i++) {
            
            if (array[i] == array[i-1]) {
                continue;
            }

            if(array[i] > array[i-1] && array[i] > array[i+1]) {
                count++;
            }
            if(array[i] < array[i-1] && array[i] < array[i+1]) {
                count++;
            }
        }
        return count;
    }
}
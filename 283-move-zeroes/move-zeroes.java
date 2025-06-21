class Solution {
    public void moveZeroes(int[] nums) {
        
        List<Integer> newArr = new ArrayList<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] != 0) {
                newArr.add(nums[i]);
            }
            else {
                count++;
            }
        }

        for(int j = 0; j < count; j++) {
            newArr.add(0);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = newArr.get(i);
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
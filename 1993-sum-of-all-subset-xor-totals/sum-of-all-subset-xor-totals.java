class Solution {
    public int subsetXORSum(int[] nums) {

        List<List<Integer>> subsets = new ArrayList<>(); 
        subsets.add(new ArrayList<>());
        int ans = 0;

        for(int num : nums) {
            int size = subsets.size();

            for(int i = 0; i < size; i++) {
                List<Integer> sub = new ArrayList<>(subsets.get(i));
                sub.add(num);
                subsets.add(sub);

                int xor = 0;
                for (int val : sub) {
                    xor ^= val;
                }
                ans += xor;
            } 

        }

        return ans;
    }
}
  
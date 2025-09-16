class Solution {

    public long GCD(long x, long y) {
        if (y == 0) {
            return x;
        }
        return GCD(y, x%y);
    }

    public long LCM(long x, long y) {
        return (x / GCD(x, y)) * y; 
    }

    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Long> result = new ArrayList<>();
        for (int num : nums) {
            result.add((long) num);
        }

        int i = 0;
        while (i < result.size() - 1) {
            long x = result.get(i);
            long y = result.get(i+1);

            long g = GCD(x, y);
            if (g > 1) {
                long lcm = LCM(x, y);

                result.set(i, lcm);
                result.remove(i + 1);

                if (i > 0) i--;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (long val : result) { 
            ans.add((int) val);
        }

        return ans;
    }
}

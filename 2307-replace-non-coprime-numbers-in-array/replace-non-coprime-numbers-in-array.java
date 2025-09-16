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
        List<Long> stack = new ArrayList<>();

        for (int num : nums) {
            long curr = num;

            while (!stack.isEmpty()) {
                long top = stack.get(stack.size() - 1);
                long g = GCD(top, curr);

                if (g > 1) {
                    curr = LCM(top, curr);
                    stack.remove(stack.size() - 1);
                } else {
                    break;
                }
            }
            stack.add(curr);
        }

        List<Integer> result = new ArrayList<>();
        for (long val : stack) {
            result.add((int) val);
        }

        return result;
    }
}

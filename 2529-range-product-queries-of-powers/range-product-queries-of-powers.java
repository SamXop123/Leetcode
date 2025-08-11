class Solution {
    public int[] productQueries(int n, int[][] queries) {
        final int MOD = 1_000_000_007;
        
        List<Integer> Allpowers = new ArrayList<>();
        for (int i = 1; i <= n; i <<= 1) {
            Allpowers.add(i);
        }

        List<Integer> powers = new ArrayList<>();
        int sum = 0;

        for (int i = Allpowers.size() - 1; i >= 0; i--) {
            int element = Allpowers.get(i);
            sum += element;

            if (sum > n) {
                sum -= element;
                continue;
            } else {
                powers.add(element);
            }

            if (sum == n) {
                break;
            }
        }
        Collections.reverse(powers);

        int[] answers = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long currPower = 1;
            
            for (int j = left; j <= right; j++) {
                currPower = (currPower * powers.get(j)) % MOD;
            }
            answers[i] = (int) currPower;
        }
        
        return answers;
    }
}

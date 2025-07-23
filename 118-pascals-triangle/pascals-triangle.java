class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j = 1; j < i; j++) {
                List<Integer> prevRow = result.get(i - 1);
                int left = prevRow.get(j - 1);
                int right = prevRow.get(j);
                int val = left + right; 
                row.add(val);
            }

            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }
}

class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String statement = operations[i];
            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }
        return x;
    }
}
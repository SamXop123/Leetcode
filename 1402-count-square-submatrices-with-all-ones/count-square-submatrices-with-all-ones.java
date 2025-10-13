class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int totalSquares = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 1) {
                    totalSquares++;

                    int maxSize = Math.min(n-i, m-j);
                    int size = 1;
                    while (size < maxSize) {
                        boolean isSquare = true;

                        for (int k = 0; k <= size; k++) {
                            if (matrix[i+size][j+k] == 0 || matrix[i+k][j+size] == 0) {
                                isSquare = false;
                                break;
                            }
                        }

                        if (!isSquare) break;
                        totalSquares++;
                        size++;
                    }
                }
            }
        }

        return totalSquares;
    }
}

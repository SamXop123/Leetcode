class Solution {
    public int minimumArea(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int minRow = -1;
        int maxRow = -1;
        int minCol = -1;
        int maxCol = -1;
        boolean foundOne = false;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if (!foundOne) {
                        minRow = i;
                        maxRow = i;
                        minCol = j;
                        maxCol = j;
                        foundOne = true;
                    } else {
                        if (i < minRow) minRow = i;
                        else if (i > maxRow) maxRow = i;
                        if (j < minCol) minCol = j;
                        else if (j > maxCol) maxCol = j;
                    }
                }
            }
        }
        
        if (!foundOne) {
            return 0;
        }
        
        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;
        return height * width;
    }
}
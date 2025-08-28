class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        
        List<Integer> diagonal = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            diagonal.clear();
            for (int j = 0; i+j < n; j++) {
                diagonal.add(grid[i+j][j]);
            }

            Collections.sort(diagonal, Collections.reverseOrder());

            for (int j = 0; i+j < n; j++) {
                grid[i+j][j] = diagonal.get(j);
            }
        }
        
    
        for (int j = 1; j < n; j++) {
            diagonal.clear();
            for (int i = 0; j+i < n; i++) {
                diagonal.add(grid[i][j+i]);
            }

            Collections.sort(diagonal);

            for (int i = 0; j+i < n; i++) {
                grid[i][j+i] = diagonal.get(i);
            }
        }

        return grid;
    }
}
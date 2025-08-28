class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length; 

        for(int i = 0; i < n; i++) {
            List<Integer> lowerDiagonals = new ArrayList<>();

            for(int j = 0; j+i < n; j++) {
             lowerDiagonals.add(grid[i+j][j]);
            }

            Collections.sort(lowerDiagonals, Collections.reverseOrder());

            for(int j = 0; j+i < n; j++) {
                grid[i+j][j] = lowerDiagonals.get(j);
            }
        }

        for(int j = 1; j < n; j++) {
            List<Integer> upperDiagonals = new ArrayList<>();

            for(int i = 0; i+j < n; i++) {
                upperDiagonals.add(grid[i][i+j]);
            }

            Collections.sort(upperDiagonals);

            for(int i = 0; i+j < n; i++) {
                grid[i][i+j] = upperDiagonals.get(i);
            }
        }
        return grid;
    }
}
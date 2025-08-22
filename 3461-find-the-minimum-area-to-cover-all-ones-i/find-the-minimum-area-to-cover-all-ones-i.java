class Solution {
    public int minimumArea(int[][] grid) {
        
        ArrayList<ArrayList<Integer>> oneIndexes = new ArrayList<>();

        for(int i = 0; i < grid.length; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    row.add(i);
                    row.add(j);
                }
            }
            if (!row.isEmpty()) {
                oneIndexes.add(row);
            }
        }
        if (oneIndexes.isEmpty()) {
            return 0;
        }

        int height = Math.abs(oneIndexes.get(0).get(0) - oneIndexes.get(oneIndexes.size()-1).get(0)) + 1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (List<Integer> innerList : oneIndexes) {
            for (int j = 1; j < innerList.size(); j += 2) {
                int col = innerList.get(j);
                if (col < min) {min = col;}
                if (col > max) {max = col;}
            }
        }

        int width = max - min + 1;

        return height*width;
    }
}
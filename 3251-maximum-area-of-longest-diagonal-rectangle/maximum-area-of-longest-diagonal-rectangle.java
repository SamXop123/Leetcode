class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        int maxDiag = 0;
        int maxArea = 0;
        for(int i = 0; i<dimensions.length; i++) {
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            int diagonal = l*l + b*b;
            int currArea = l*b;

            if(diagonal > maxDiag) {
                maxDiag = diagonal;
                maxArea = currArea;
            } else if(diagonal == maxDiag) {
                if(currArea > maxArea) {
                    maxArea = currArea;
                }
            }
        }
        return maxArea;
    }
}
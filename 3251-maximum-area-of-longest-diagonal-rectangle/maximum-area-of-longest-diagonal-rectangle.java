class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxDiag = 0;
        int maxArea = 0;
        for (int i = 0; i < dimensions.length; i++) {
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            int diagonal = l*l + w*w;
            
            if (diagonal > maxDiag) {
                maxDiag = diagonal;
                maxArea = l*w;
            } else if (diagonal == maxDiag) {
                int area = l * w;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        
        return maxArea;
    }
}
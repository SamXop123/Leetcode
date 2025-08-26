class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        double maxDiag = 0;
        int area = 0;
        for(int i = 0; i<dimensions.length; i++) {
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            double diagonal = Math.sqrt(l*l + b*b);
            int currArea = l*b;

            if(diagonal > maxDiag) {
                maxDiag = diagonal;
                area = currArea;
            } else if(diagonal == maxDiag) {
                if(currArea > area) {
                    area = currArea;
                }
            }
        }
        return area;
    }
}
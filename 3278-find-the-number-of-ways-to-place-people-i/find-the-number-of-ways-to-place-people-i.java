class Solution {
    public int numberOfPairs(int[][] points) {
        int count = 0;
        int n = points.length;
        
        for (int i = 0; i < n; i++) {
            int[] pointA = points[i];
            
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int[] pointB = points[j];
                
                if (pointA[0] <= pointB[0] && pointA[1] >= pointB[1]) {
                    boolean isValid = true;
                    
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue; 
                        int[] pointC = points[k];
                        
                        boolean isInsideX = pointC[0] >= pointA[0] && pointC[0] <= pointB[0];
                        boolean isInsideY = pointC[1] <= pointA[1] && pointC[1] >= pointB[1];
                        
                        if (isInsideX && isInsideY) {
                            isValid = false; 
                            break; 
                        }
                    }
                    
                    if (isValid) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}
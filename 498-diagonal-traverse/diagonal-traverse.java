class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
 
        // if (mat == null || mat.length == 0) return new int[0];
        
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m*n];
        int k = 0;
        int trackerSum = 0;
        
        while (trackerSum <= m + n - 2) {
            
            if (trackerSum % 2 == 0) {
                int i = Math.min(trackerSum, m - 1);
                int j = trackerSum - i;
                
                while (i >= 0 && j < n) {
                    arr[k++] = mat[i][j];
                    i--;
                    j++;
                }
            } else {
                int j = Math.min(trackerSum, n - 1);
                int i = trackerSum - j;
                
                while (j >= 0 && i < m) {
                    arr[k++] = mat[i][j];
                    i++;
                    j--;
                }
            }
            trackerSum++;
        }
        
        return arr;
    }
}
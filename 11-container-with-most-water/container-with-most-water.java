class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int result = 0;
        int left = 0;
        int right = n-1;

        while(left < right) {
            int current = 0;
            int i = right - left;

            if(height[right] > height[left]) {
                current = height[left]*i;
                left++;
            } else {
                current = height[right]*i;
                right--;
            }

            if(result < current) {
                result = current; 
            }
        }

        return result;
    }
}
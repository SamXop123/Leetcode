class Solution {
    public int maxArea(int[] height) {
        
        int n = height.length;
        int result = 0;
        int left = 0;
        int right = n-1;

        while(left < right) {
            int leftLineHeight = height[left];
            int rightLineHeight = height[right];
            int current = 0;
            int i = right - left;

            if(rightLineHeight > leftLineHeight) {
                current = leftLineHeight*i;
                left++;
            } else {
                current = rightLineHeight*i;
                right--;
            }

            if(result < current) {
                result = current; 
            }
        }

        return result;
    }
}
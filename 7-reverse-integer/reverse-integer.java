class Solution {
    public int reverse(int x) {
                                                        
        int original = x;
        x = Math.abs(x);
        
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + (x % 10);
            x /= 10;
        }
        
        if (original < 0) {
            reversed = -reversed;
        }
        
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) reversed;
    }
}
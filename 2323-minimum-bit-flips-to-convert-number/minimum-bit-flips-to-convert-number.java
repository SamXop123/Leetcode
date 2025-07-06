class Solution {
    public int minBitFlips(int start, int goal) {
        
        if (start == goal) {
            return 0;
        }
        int xor = start ^ goal;
        int steps = 0;
        while (xor != 0) {
            int lastBit = xor & 1;
            if (lastBit == 1) {
                steps++;
            }
            xor = xor >> 1;
        }    
        return steps;
    }
}    
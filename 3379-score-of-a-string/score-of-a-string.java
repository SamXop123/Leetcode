class Solution {
    public int scoreOfString(String s) {
        
        int sum = 0;
        for(int i = 1; i < s.length(); i++) {
            int ascii1 = s.charAt(i-1);
            int ascii2 = s.charAt(i);
            sum += Math.abs(ascii1 - ascii2);
        }

        return sum;
    }
}
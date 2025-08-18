class Solution {
    public int lengthOfLastWord(String s) {
        String trimStr = s.trim(); 
        int count = 0;
        for (int i = trimStr.length()-1; i >= 0; i--) { 
            char c = trimStr.charAt(i);
            if (c == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}
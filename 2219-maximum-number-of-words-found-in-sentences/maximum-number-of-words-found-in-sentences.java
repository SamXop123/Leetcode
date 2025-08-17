class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int countX = 0;
        for(String c : sentences) {
            int count = 1;
            for(int i = 0; i < c.length(); i++) {
                if(c.charAt(i) == ' ') {
                    count++;
                }
            }

            if(count > countX) {
                countX = count;
            }

        }
        return countX;
    }
}
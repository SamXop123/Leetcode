class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String result = "";

        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        int i = 0;
        boolean common = true;

        while(i < minLength) {
            char commonChar = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++) {
                if(commonChar != strs[j].charAt(i)) {
                    common = false;
                    break;
                } 
            }
            if(common) {
                result += commonChar;
            }
            i++;
        }
        return result;
    }
}
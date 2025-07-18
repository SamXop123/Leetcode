class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder result = new StringBuilder();

        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        int i = 0;
        while (i < minLength) {
            char commonChar = strs[0].charAt(i);
            boolean common = true;

            for (int j = 0; j < strs.length; j++) {
                if (commonChar != strs[j].charAt(i)) {
                    common = false;
                    break;
                }
            }

            if (common) {
                result.append(commonChar);
            } else {
                break; 
            }

            i++;
        }
        return result.toString();
    }
}

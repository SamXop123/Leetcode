class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;
            
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            // ODD
            int left = i;
            int right = i;
            while (left >= 0 && right < n && 
            s.charAt(left) == s.charAt(right)) 
            {
                if (right - left + 1 > sb.length()) {
                    sb = new StringBuilder(s.substring(left, right + 1));
                }
                left--;
                right++;
            }

            // EVEN
            left = i;
            right = i+1;
            while(left >= 0 && right < n && 
            s.charAt(left) == s.charAt(right)) 
            {
                if (right - left + 1 > sb.length()) {
                    sb = new StringBuilder(s.substring(left, right + 1));
                }
                left--;
                right++;
            }
        }

        return sb.toString();
    }
}
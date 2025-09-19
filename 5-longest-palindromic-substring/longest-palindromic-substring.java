class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;
            
        StringBuilder sb = new StringBuilder();

        for (int center = 0; center < n; center++) {

            // ODD
            int left = center;
            int right = center;
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
            left = center;
            right = center+1;
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
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;
            
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
    
        for (int center = 0; center < n; center++) {

            // ODD
            int left = center;
            int right = center;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > sb1.length()) {
                    sb1 = new StringBuilder(s.substring(left, right + 1));
                }
                left--;
                right++;
            }

            // EVEN
            left = center;
            right = center+1;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > sb2.length()) {
                    sb2 = new StringBuilder(s.substring(left, right + 1));
                }
                left--;
                right++;
            }
        }

        return sb1.length() > sb2.length() ? sb1.toString() : sb2.toString();
    }
}
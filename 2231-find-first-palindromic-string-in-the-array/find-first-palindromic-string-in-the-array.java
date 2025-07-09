class Solution {
    public String firstPalindrome(String[] words) {

        for (String x : words) {
            boolean found = true; 

            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) != x.charAt(x.length() - i - 1)) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return x;
            }
        }

        return "";
    }
}

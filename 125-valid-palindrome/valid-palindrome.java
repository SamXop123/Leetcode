class Solution {
    public boolean isPalindrome(String s) {
        
        if (s.isEmpty()) return true;

        String raw = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for (int i = 0; i < raw.length(); i++) {
            if (raw.charAt(i) != raw.charAt(raw.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
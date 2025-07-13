class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String Combinations = s + s;

        if(Combinations.contains(goal)) {
            return true;
        } else {
            return false;
        }

    }
}
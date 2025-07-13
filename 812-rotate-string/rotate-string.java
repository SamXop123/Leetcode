class Solution {
    public boolean rotateString(String s, String goal) {
        
        boolean isEqual = false;
        String newString = "";

        for(int i = 0; i < s.length(); i++) {
            String A = s.substring(i);       
            String B = s.substring(0, i);   
            newString = A + B; 

            if(newString.equals(goal)) {
                isEqual = true;
                break;
            }
        }

        return isEqual;
    }
}
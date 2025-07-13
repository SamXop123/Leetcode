class Solution {
    public boolean rotateString(String s, String goal) {
        
        int n = s.length();
        boolean isEqual = false;
        String newString = "";
        
        for(int i = 0; i < n; i++) {
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
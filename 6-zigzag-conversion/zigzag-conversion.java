class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int currentRow = 0;
        boolean goingdown = false;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            String current = rows[currentRow];
            current += c;
            rows[currentRow] = current;

            if (currentRow==0 || currentRow == numRows-1) {
                goingdown = !goingdown;
            }

            if(goingdown) {
                currentRow += 1;
            } else {
                currentRow += -1;
            }
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {
            result += rows[i];
        }

        return result;
    }
}

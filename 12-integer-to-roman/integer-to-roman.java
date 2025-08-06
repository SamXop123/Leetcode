class Solution {
    public static int[][] ROMAN_VALUES = {
        {1000, 'M'},
        {900, 'C', 'M'}, // CM = 900
        {500, 'D'},
        {400, 'C', 'D'}, // CD = 400
        {100, 'C'},
        {90, 'X', 'C'},  // XC = 90
        {50, 'L'},
        {40, 'X', 'L'},  // XL = 40
        {10, 'X'},
        {9, 'I', 'X'},   // IX = 9
        {5, 'V'},
        {4, 'I', 'V'},   // IV = 4
        {1, 'I'}
    };

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        for (int[] mapping : ROMAN_VALUES) {
            int value = mapping[0];
            
            while (num >= value) {
                if (mapping.length == 2) {
                    result.append((char)mapping[1]);
                } else {
                    result.append((char)mapping[1]).append((char)mapping[2]);
                }
                num -= value;
            }
        }
        return result.toString();
    }
}
class Solution {
    public static int[][] RomanValues = {
        {1000, 'M'},
        {900, 'C', 'M'},
        {500, 'D'},
        {400, 'C', 'D'},
        {100, 'C'},
        {90, 'X', 'C'},
        {50, 'L'},
        {40, 'X', 'L'},
        {10, 'X'},
        {9, 'I', 'X'},
        {5, 'V'},
        {4, 'I', 'V'},
        {1, 'I'}
    };

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();

        for (int[] mapping : RomanValues) {
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
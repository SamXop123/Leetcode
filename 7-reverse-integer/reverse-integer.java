class Solution {
    public int reverse(int x) {

        // BigInteger bigX = BigInteger.valueOf(x);
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        boolean minus = false;
        if(sb.charAt(0) == '-') {
            sb.deleteCharAt(0);
            minus = true;
        }

        sb.reverse();
        // int left = 0;
        // int right = sb.length() - 1;
        // while (left < right) {
        //     char temp = sb.charAt(left);
        //     sb.setCharAt(left, sb.charAt(right));
        //     sb.setCharAt(right, temp);         

        //     left++;
        //     right--;
        // }

        if(minus) {
            sb.insert(0, '-');
        }

        long reversedLong = Long.parseLong(sb.toString());
        if (reversedLong > Integer.MAX_VALUE || reversedLong < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) reversedLong;
    }
}
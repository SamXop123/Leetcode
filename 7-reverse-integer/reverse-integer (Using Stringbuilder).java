class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));

        boolean minus = false;
        if(sb.charAt(0) == '-') {
            sb.deleteCharAt(0);
            minus = true;
        }

        sb.reverse();

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

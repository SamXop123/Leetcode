class Solution {
    public int[] sumZero(int n) {
        if(n == 1) {
            return new int[1];
        }

        int arr[] = new int[n];
        int halfN = -n/2;
        for(int i = 0; i < n; i++) {
            if(halfN == 0) {
                if(n%2 == 0) {
                    halfN++;
                }
            }
            arr[i] = halfN;
            halfN++;
        }

        return arr;
    }
}
import java.util.Arrays;

class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr); 

        int i = 1;
        int count = 1;
        int maxLucky = -1;

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] == arr[i]) {
                count++;
            } else {
                if (arr[j] == count) {
                    if (arr[j] > maxLucky) {
                        maxLucky = arr[j];
                    }
                }
                count = 1;
            }
            i++;
        }

        if (arr[arr.length - 1] == count) {
            if (arr[arr.length - 1] > maxLucky) {
                maxLucky = arr[arr.length - 1];
            }
        }

        return maxLucky;
    }
}

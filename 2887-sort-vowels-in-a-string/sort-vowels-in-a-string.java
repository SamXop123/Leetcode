class Solution {
    public String sortVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels.append(ch);
            }
        }

        char[] chArr = vowels.toString().toCharArray(); 

        // for(int i = 0; i < chArr.length; i++) {
        //     for(int j = 0; j < chArr.length-i-1; j++) {

        //         if((int) chArr[j] > (int) chArr[j+1]) {
        //             char temp = chArr[j];
        //             chArr[j] = chArr[j+1];
        //             chArr[j+1] = temp;
        //         }
        //     }
        // }
        Arrays.sort(chArr);

        StringBuilder t = new StringBuilder();
        int k = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                t.append(chArr[k]);
                k++;
            } else {
                t.append(c);
            }
            
        }

        return t.toString();

    }
}
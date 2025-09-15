class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        
        HashSet<Character> set = new HashSet<>();

        int count = 0;
        List<String> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char c : text.toCharArray()) {
            if(c != ' ') {
                sb.append(c);
            } else if (c == ' '){
                arr.add(sb.toString());
                sb.setLength(0);
            }
        }
        
        if (sb.length() > 0) {
            arr.add(sb.toString());
        }


        for (String word : arr) {
            boolean canType = true;  

            for (char c : brokenLetters.toCharArray()) {
                if (word.indexOf(c) != -1) {
                    canType = false;
                    break;
                }
            }

            if (canType) {
                count++;
            }
        }


        return count;
    }
}
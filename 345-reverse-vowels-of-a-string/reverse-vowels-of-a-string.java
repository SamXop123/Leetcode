class Solution {
    public String reverseVowels(String s) {
        
        List<Character> vowelList = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelList.add(ch);
            }
        }
        Collections.reverse(vowelList);

        for(int j = 0; j < s.length(); j++) {
            char x = s.charAt(j);

            if(vowels.indexOf(x) != -1) {
                result += vowelList.get(0);
                vowelList.remove(0);
            }
            else {
                result += x;
            }
        }
       
        return result;
    }
}
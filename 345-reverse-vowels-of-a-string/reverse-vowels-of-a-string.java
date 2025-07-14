class Solution {
    public String reverseVowels(String s) {
        List<Character> vowelList = new ArrayList<>();
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                vowelList.add(ch);
            }
        }

        Collections.reverse(vowelList);
        int vowelIndex = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowels.indexOf(ch) != -1) {
                result.append(vowelList.get(vowelIndex));
                vowelIndex++;
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

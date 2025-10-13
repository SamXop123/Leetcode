class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();

        String prevSorted = "";

        for (String s : words) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if (!sorted.equals(prevSorted)) {
                ans.add(s);
                prevSorted = sorted;
            }
        }

        return ans;
    }
}

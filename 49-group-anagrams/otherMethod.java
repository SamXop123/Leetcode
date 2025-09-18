class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            boolean placed = false;

            for (List<String> group : result) {
                char[] firstChars = group.get(0).toCharArray();
                Arrays.sort(firstChars);
                String firstSorted = new String(firstChars);

                if (sorted.equals(firstSorted)) {
                    group.add(s);
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(s);
                result.add(newGroup);
            }
        }

        return result;
    }
}

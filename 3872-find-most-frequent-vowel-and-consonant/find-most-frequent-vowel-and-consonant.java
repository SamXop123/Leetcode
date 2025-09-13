class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        int max = 0;
        int vowMax = 0;
        for (char key : map.keySet()) {
            
            if(key == 'a' || key == 'e' || key == 'i' || 
            key == 'o' || key == 'u') {
                if(map.get(key) > vowMax) {
                    vowMax = map.get(key);
                }
            } else {
                if(max < map.get(key)) {
                    max = map.get(key);
                }
            }
        }

        return max + vowMax;
    }
}
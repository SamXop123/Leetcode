class Solution {
    public String largestGoodInteger(String num) {
        ArrayList<Integer> goods = new ArrayList<>();
        
        for (int i = 0; i <= num.length()-3; i++) {
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)) {
                String triplet = num.substring(i, i + 3);
                goods.add(Integer.parseInt(triplet));
            }
        }
        
        if (goods.isEmpty()) {
            return "";
        }
        
        int max = goods.get(0);
        for (int i = 1; i < goods.size(); i++) {
            if (goods.get(i) > max) {
                max = goods.get(i);
            }
        }
        
        if (max == 0) {
            return "000";
        } else {
            return String.valueOf(max);
        }
    }
}
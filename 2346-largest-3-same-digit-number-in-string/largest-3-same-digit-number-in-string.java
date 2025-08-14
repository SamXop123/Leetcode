class Solution {
    public String largestGoodInteger(String num) {

        ArrayList<Integer> goods = new ArrayList<>();

        int k = 0;
        for(int i = 0; i < num.length()-2; i++) {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)) {
                String temp = "" + num.charAt(i) + num.charAt(i+1) + num.charAt(i+2);
                goods.add(Integer.parseInt(temp));
                k++;
            }
        }
        
        int max = 0;
        if(goods.size() > 0) { 
            for(int i = 0; i < goods.size(); i++) {
                if(goods.get(i) > max) {
                    max = goods.get(i);
                }
            }
        } else {
            return "";
        }

        
        if(max == 0) {
            return "000";
        }

        return Integer.toString(max);
    }
}

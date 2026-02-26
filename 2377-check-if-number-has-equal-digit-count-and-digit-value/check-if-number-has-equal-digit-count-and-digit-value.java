class Solution {
    public boolean digitCount(String num) {
        Map<Integer , Integer> mp = new HashMap<>();
        for(char ch : num.toCharArray()){
            int digit = ch - '0';
            mp.put(digit, mp.getOrDefault(digit,0) + 1);
        }
        for(int i=0 ; i<num.length() ; i++){
            if(num.charAt(i) -'0' != mp.getOrDefault(i,0)){
                return false;
            }
        }
        return true;
    }
}
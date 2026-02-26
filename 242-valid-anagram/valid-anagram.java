class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Integer> m = new HashMap<>();
        for(char ch : s.toCharArray()){
            m.put(ch, m.getOrDefault(ch,0) +1);
        }
        for(char ch : t.toCharArray()){
            if(!m.containsKey(ch) || m.get(ch) == 0){
                return false;
            }
            m.put(ch, m.get(ch) -1);
        }
        return true;
    }
}
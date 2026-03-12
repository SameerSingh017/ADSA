class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Character> m = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for(int i=0 ; i<s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(m.containsKey(c1)){
                if(m.get(c1) != c2){
                    return false;
                }
            }else{
                if(used.contains(c2)){
                    return false;
                }
                m.put(c1, c2);
                used.add(c2);
            }
        }
        return true;
    }
}
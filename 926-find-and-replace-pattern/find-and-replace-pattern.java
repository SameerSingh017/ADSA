class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        for(int i=0 ; i<words.length ; i++){
            if(match(words[i], pattern)){
                result.add(words[i]);
            }
        }
        return result;
    }
    public boolean match(String word, String pattern){
        if(word.length() != pattern.length()){
            return false;
        }
        Map<Character, Character> m = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for(int i=0 ; i<word.length() ; i++){
            char c1 = word.charAt(i);
            char c2 = pattern.charAt(i);

            if(m.containsKey(c1)){
                if(!m.get(c1).equals(c2)){
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
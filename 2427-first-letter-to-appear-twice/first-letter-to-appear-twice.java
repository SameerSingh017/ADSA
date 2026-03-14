class Solution {
    public char repeatedCharacter(String s) {
        Set<Character> unique = new HashSet<>();
        for(char c : s.toCharArray()){
            if(unique.contains(c)){
                return c;
            }
            unique.add(c);
        }
        return ' ';
    }
}
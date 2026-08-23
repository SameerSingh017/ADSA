class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();

        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        int expected = mp.get(s.charAt(0));
        for(int freq : mp.values()){
            if(freq != expected) return false;
        }
        return true;

    }
}
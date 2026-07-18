class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words, (a,b) -> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });
        Set<String> s = new HashSet<>();
        String ans = "";
        for(String word : words){
            if(word.length() == 1 || s.contains(word.substring(0, word.length() -1))){
                s.add(word);
                if(word.length() > ans.length()){
                    ans = word;
                }
            }
        }
        return ans;
    }
}
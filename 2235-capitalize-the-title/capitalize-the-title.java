class Solution {

    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            word = word.toLowerCase();
            if(word.length() > 2) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}